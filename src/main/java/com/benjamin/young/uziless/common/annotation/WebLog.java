package com.benjamin.young.uziless.common.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
/**
 *  @Retention(RetentionPolicy.RUNTIME)：什么时候使用该注解，目前定义为运行时
 *  @Target({ElementType.METHOD})：表示注解用于什么地方，目前定义为作用于方法上
 *  @Documented：该注解表示是否将包含在JavaDoc中
 */
public @interface WebLog {
    /**
     * 日志描述信息
     *
     * 默认为空
     * @return
     */
    String description() default "";
}
