package com.benjamin.young.uziless.common.handler;

import java.util.List;
import java.util.stream.Stream;

public interface HandlerChainExecutor<T> {
    void execute(T context);

    void execute(T context,boolean block);

    void execute(List<T> contextList);

    void execute(List<T> contextList, boolean block);

    void execute(Stream<T> stream);

    void execute(Stream<T> stream, boolean block);

}
