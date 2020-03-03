package com.benjamin.young.uziless.common.handler;


public interface Handler<T> {
    default boolean supports(T context){return true;}

    void handle(T context, HandlerChain<T> chain);
}
