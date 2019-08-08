package com.lonewolf.tool.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-08 17:05
 * @Description:
 */
@Configuration
public class AllInterceptorConfig implements WebMvcConfigurer {

    /**
     * [Spring-boot拦截器]
     * @author xiangyong.zeng
     * @param registry
     * @return void
     * @date 2019-08-08 17:50
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 实现 WebMvcConfigurer 不会导致静态资源被拦截
        registry.addInterceptor(new AllInterceptor()).addPathPatterns("/**");
    }

}
