package com.test.annotation.handler;

import java.lang.annotation.Annotation;

/**
 * aop处理操作接口  所有aop操作注解的实现类都要 实现它
 */
public interface HandlerMethodInterface<A extends Annotation,T> {

    /**
     * 初始化操作
     *
     * @param a 标注在方法上的注解对象
     * */
    void init(A a);

    /**
     * 方法执行之前
     * 进行具体业务操作
     *
     * @param t 调用方法的入参
     * */
    void doWithBefore(T t);

    /**
     * 方法执行之后 返回结果之前
     * 进行具体业务操作
     *
     * @param t 调用方法的入参
     * */
    void doWithAfter(T t);

}
