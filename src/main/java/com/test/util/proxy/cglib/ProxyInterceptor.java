package com.test.util.proxy.cglib;

import com.test.annotation.handler.HandlerMethod;

import com.test.annotation.handler.HandlerMethodInterface;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by ljg on 2017/3/6.
 */
public class ProxyInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Annotation[]annotations=method.getDeclaredAnnotations();
        if(annotations==null||annotations.length==0){
            Object o1 = methodProxy.invokeSuper(o, objects);
            return o1;
        }
        for (Annotation annotation:annotations){
            Annotation[]ans=annotation.annotationType().getDeclaredAnnotations();
            if(ans!=null&& ans.length>0){
                for (Annotation a:ans){
                    if(a instanceof HandlerMethod){
                        HandlerMethodInterface in= ((HandlerMethod) a).doWith().newInstance();
                        in.init(annotation);
                        in.doWith(objects);
                    }
                }
            }
        }
        return null;
    }
}
