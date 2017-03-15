package com.test.annotation.aop;

import com.test.annotation.handler.HandlerMethodInterface;


/**
 * Created by ljg on 2017/3/6.
 */
public class HandlerBefore implements HandlerMethodInterface<Before,Object> {

    private String[]exe;

    public void init(Before before) {
        this.exe=before.exe();
    }

    public void doWithBefore(Object o) {
        System.out.println("doWithBefore==》"+exe[0]);
    }

    public void doWithAfter(Object o) {
        System.out.println("doWithAfter==》"+exe[0]);

    }
}
