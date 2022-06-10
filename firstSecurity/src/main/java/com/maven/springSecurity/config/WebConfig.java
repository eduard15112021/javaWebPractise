package com.maven.springSecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.maven.springSecurity.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

    public void configureViewResolver(ViewResolverRegistry registry){
        registry.jsp().prefix("/WEB-INF/views/").suffix(".jsp");
    }
}
