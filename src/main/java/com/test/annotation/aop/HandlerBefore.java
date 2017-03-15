package com.test.annotation.aop;

import com.test.annotation.handler.HandlerMethodInterface;


/**
 * Created by ljg on 2017/3/6.
 */
public class HandlerBefore implements HandlerMethodInterface<Before,Object> {

    private String[]exe;

    public void init(Before before){
        //初始化操作
        this.exe=before.exe();
    }

    public void doWith(Object o) {
        //实际处理操作
        System.out.println(exe[0]);
    }
}
