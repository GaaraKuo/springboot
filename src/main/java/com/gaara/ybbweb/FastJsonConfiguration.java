package com.gaara.ybbweb;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class FastJsonConfiguration extends WebMvcConfigurerAdapter {

  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    //调用父类的配置
    super.configureMessageConverters(converters);
    //创建FastJson消息转换器
    FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
    //创建配置类
    FastJsonConfig fastJsonConfig = new FastJsonConfig();
    //修改配置返回内容的过滤
    fastJsonConfig.setSerializerFeatures(
        SerializerFeature.DisableCircularReferenceDetect,
        SerializerFeature.WriteNullListAsEmpty,
        SerializerFeature.WriteMapNullValue
    );
    fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
    //将FastJson添加到消息视图转换器列表内
    converters.add(fastJsonHttpMessageConverter);
  }
}
