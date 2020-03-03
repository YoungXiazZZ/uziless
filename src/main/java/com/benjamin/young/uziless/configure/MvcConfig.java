package com.benjamin.young.uziless.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Transactional
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 配置格式化相关
     * @param formatterRegistry
     */
    @Override
    public void addFormatters(FormatterRegistry formatterRegistry) {
    }

    /**
     * 配置拦截器
     * @param interceptorRegistry
     */
    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry) {
    }


    /**
     * 配置跨域访问相关
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    }

    /**
     * 配置 URI 与视图的映射关系
     * @param viewControllerRegistry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
    }
}
