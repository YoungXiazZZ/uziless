package com.benjamin.young.uziless.common.handler;

public interface HandlerChain<T> {
    void handle(T context);
}
