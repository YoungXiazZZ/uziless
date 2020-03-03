package com.benjamin.young.uziless.common.handler;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class ThreadPoolHandlerChainExecutor<T> implements HandlerChainExecutor<T> {

    private ExecutorService executor;
    private List<ContextHandler<T>> handlers;
    private List<ExceptionHandler<T>> exceptionHandlers;

    public ThreadPoolHandlerChainExecutor(int size, List<ContextHandler<T>> handlers, List<ExceptionHandler<T>> exceptionHandlers) {
        this.executor = Executors.newFixedThreadPool(size);
        this.handlers = handlers;
        this.exceptionHandlers = exceptionHandlers;
    }

    @Override
    public void execute(T context) {
        execute(context,false);
    }

    @Override
    public void execute(T context, boolean block) {
        execute(Arrays.asList(context), block);
    }

    @Override
    public void execute(List<T> contextList) {
        execute(contextList,false);
    }

    @Override
    public void execute(List<T> contextList, boolean block) {
        execute(contextList.stream(), block);
    }

    @Override
    public void execute(Stream<T> stream) {
        execute(stream,  false);
    }

    @Override
    public void execute(Stream<T> stream, boolean block) {
        List<Future<?>> futures =
                stream.map(context ->
                        executor.submit(()->{
                                new HandlerChainImpl<>(handlers,new HandlerChainImpl<>(exceptionHandlers, null)).handle(context);
                        })
                ).collect(Collectors.toList());
        if (block){
            futures.forEach(future -> {
                try {
                    future.get();
                    if (log.isDebugEnabled()){
                        log.debug("Future Get complete");
                    }
                }catch (Exception e){
                    log.error("Failed to retrieve future result: ", e);
                }
            });
        }
    }
}
