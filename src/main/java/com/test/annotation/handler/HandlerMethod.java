package com.test.annotation.handler;

import java.lang.annotation.*;

/**
 *
 * 标注注解的实际操作类
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HandlerMethod {

    Class<? extends HandlerMethodInterface<?,?>> doWith();
}
