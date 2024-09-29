package com.atguigu.config;

/**
 * ClassName: WebMVCConfig
 * Package: com.atguigu.config
 * Description:
 *
 * @Author HL
 * @Create 9/26/2024 1:02 PM
 * @Version:
 */

import com.atguigu.interceptors.LoginProtectedInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {
    @Autowired
    private LoginProtectedInterceptor loginProtectedInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginProtectedInterceptor).addPathPatterns("/headline/**");
    }
}
