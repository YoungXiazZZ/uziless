package com.benjamin.young.uziless.common.handler;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class HandlerChainImpl<T> implements HandlerChain<T> {

    private final List<? extends Handler<T>> handlers;

    private final HandlerChain<ExceptionHandlerContext<T>> exceptionHandlerChain;

    private int location =0;

    public HandlerChainImpl(List<? extends Handler<T>> handlers, HandlerChain<ExceptionHandlerContext<T>> exceptionHandlerChain) {
        this.handlers = handlers;
        this.exceptionHandlerChain = exceptionHandlerChain;
    }


    @Override
    public void handle(T context) {
        int index = location++;
        if (index < handlers.size()){
            Handler<T> handler = handlers.get(index);
            try {
                if (handler.supports(context)){
                    handler.handle(context,this);
                }else{
                    this.handle(context);
                }
            }catch (Exception e){
                log.error(String.format("Failed to execute the filter '%s'", handler.getClass().getSimpleName()), e);
                if (exceptionHandlerChain != null) {
                    exceptionHandlerChain.handle(new ExceptionHandlerContext<>(e, context));
                }
            }finally {
                location --;
            }
        }
    }
}
