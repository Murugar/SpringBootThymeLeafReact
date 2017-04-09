package com.iqmsoft.boot.thymeleaf.react.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.iqmsoft.boot.thymeleaf.react.interceptor.VersionInterceptor;

@Configuration
public class WebMVCConfig extends WebMvcConfigurerAdapter {

  @Autowired
  private VersionInterceptor versionInterceptor;

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(versionInterceptor);
  }
}
