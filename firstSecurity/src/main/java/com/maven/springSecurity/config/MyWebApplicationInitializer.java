package com.maven.springSecurity.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class <?> [] getRootConfigClasses() {
        return new Class[] {
                WebSecurityConfig.class
        };
        //return null;
    }

    @Override
    protected Class <?> [] getServletConfigClasses() {
        return new Class[] {
                WebConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }
}
