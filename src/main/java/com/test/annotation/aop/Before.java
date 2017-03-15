package com.test.annotation.aop;

import com.test.annotation.handler.HandlerMethod;

import java.lang.annotation.*;

/**
 *
 * 开启代理模式执行在目标方法之前
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@HandlerMethod(doWith = HandlerBefore.class)
@Documented
public @interface Before {
    /**
     * 表达式 在符合条件的方法之前执行
     * */
    String[] exe() default {};
}
