package com.lonewolf.tool.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-08 17:26
 * @Description: Spring-boot 拦截器方法实现
 */

public class AllInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(AllInterceptor.class);


    /**
     * [在方法执行前进行拦截]
     * @author xiangyong.zeng
     * @param request
     * @param response
     * @param handler
     * @return boolean
     * @date 2019-08-08 17:49
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setCharacterEncoding("UTF-8");

        return true;
    }
}
