package com.lonewolf.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * [Spring-boot启动项]
 * @author xiangyong.zeng
 * @return
 * @date 2019-08-05 14:45
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lonewolf.*.mapper")
@ComponentScan(basePackages = {"com.lonewolf"})
public class SkillResearchWebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SkillResearchWebApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SkillResearchWebApplication.class, args);
    }

}
