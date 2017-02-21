package com.test.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by ljg on 2017/2/21.
 */
public class SecurityInterceptor extends HandlerInterceptorAdapter {

    /**
     * 不拦截的url
     * */
    private List<String> excludes;

    public void setExcludes(List<String> excludes) {
        this.excludes = excludes;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return super.preHandle(request, response, handler);
    }
}
