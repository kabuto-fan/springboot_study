package com.kabuto.springboot_study.controller;

import com.kabuto.springboot_study.config.MicroServiceUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("urlconfig")
public class UrlConfigController {
    public static final Logger logger = LoggerFactory.getLogger(UrlConfigController.class);
    @Resource
    private MicroServiceUrl microServiceUrl;
    @RequestMapping("testUrl")
    public String testUrl(){
        logger.info("=====获取的订单服务地址为：{}", microServiceUrl.getOrderUrl());
        logger.info("=====获取的用户服务地址为：{}", microServiceUrl.getUserUrl());
        logger.info("=====获取的购物车服务地址为：{}", microServiceUrl.getShoppingUrl());
        return "success";
    }
}
