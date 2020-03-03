package com.benjamin.young.uziless.common.handler;

import lombok.Getter;

@Getter
public class ExceptionHandlerContext<T> {

    private Exception exception;
    private T context;

    public ExceptionHandlerContext(Exception exception, T context){
        this.exception = exception;
        this.context = context;
    }
}
