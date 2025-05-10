package com.kabuto.springboot_study.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*保存微服务的 url*/
@Component
@ConfigurationProperties(prefix = "url")
@Data
public class MicroServiceUrl {
    private String orderUrl;
    private String userUrl;
    private String shoppingUrl;
}
