package com.kabuto.springboot_study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {
    private static final Logger logger =  LoggerFactory.getLogger(ConfigController.class);
    @Value("${url.orderUrl}")
    private String orderUrl;
    @RequestMapping("/test")
    public String testConfig(){
        logger.info("=====获取的订单服务地址为：{}",orderUrl);
        return "success";
    }
}
