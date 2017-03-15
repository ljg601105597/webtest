package com.test.util.proxy;

import com.test.util.proxy.cglib.ProxyInterceptor;
import net.sf.cglib.proxy.Enhancer;

/**
 * Created by ljg on 2017/3/6.
 */
public class ProxyUtil {
    /**
     * cglib代理
     * */
    public static synchronized Object cglibProxy(Object object){
        ProxyInterceptor cglibProxy = new ProxyInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(cglibProxy);
        return enhancer.create();
    }
}
