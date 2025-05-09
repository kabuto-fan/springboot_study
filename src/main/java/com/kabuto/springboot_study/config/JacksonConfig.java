package com.kabuto.springboot_study.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;

@Configuration
public class JacksonConfig {
    @Bean //回一个 Spring 容器管理的 Bean。在这里，它返回一个自定义的 ObjectMapper 实例。
    @Primary //表示该 Bean 是默认的 ObjectMapper 实现。如果容器中存在多个 ObjectMapper Bean，Spring 会优先使用标记为 @Primary 的 Bean。
    @ConditionalOnMissingBean(ObjectMapper.class) //只有在容器中不存在 ObjectMapper Bean 时，才会创建该 Bean
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder){ // Jackson2ObjectMapperBuilder Spring Boot 提供的构建器，用于创建和配置 ObjectMapper
        ObjectMapper objectMapper = builder.createXmlMapper(false).build(); //配置 ObjectMapper 不支持 XML 序列化/反序列化（false 表示禁用 XML 支持）。
        /*
        SerializerProvider：这是 Jackson 中的一个接口，负责提供序列化过程中所需的各种服务，包括查找合适的序列化器、处理类型信息等
        getSerializerProvider()：ObjectMapper 的这个方法返回当前配置的 SerializerProvider 实例，用于访问和配置序列化相关的功能。
        */
        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString("");
            }

        });
return objectMapper;
    }
}
