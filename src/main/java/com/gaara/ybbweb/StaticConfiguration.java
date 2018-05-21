package com.gaara.ybbweb;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticConfiguration extends WebMvcConfigurerAdapter {

  //自定义静态资源文件路径
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry){
    registry.addResourceHandler("/ybb/resources/**").addResourceLocations("classpath:/static/");

  }
}
