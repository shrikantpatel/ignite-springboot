package com.shri.demo;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletContextListener;
import java.util.Arrays;

@Configuration
public class CacheConfig {

    @Bean
    FilterRegistrationBean myFilterRegistration(SecurityProperties securityProperties) {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new org.apache.ignite.cache.websession.WebSessionFilter());
        frb.setUrlPatterns(Arrays.asList("/*"));
        frb.setOrder(securityProperties.getFilterOrder() -10 );
        return frb;
    }

    @Bean
    ServletListenerRegistrationBean<ServletContextListener> myServletListener() {
        ServletListenerRegistrationBean<ServletContextListener> srb =
                new ServletListenerRegistrationBean<>();
        srb.setListener(new org.apache.ignite.startup.servlet.ServletContextListenerStartup());
        return srb;
    }

}