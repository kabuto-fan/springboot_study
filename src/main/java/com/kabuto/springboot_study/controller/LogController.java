package com.kabuto.springboot_study.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    private final static Logger logger = LoggerFactory.getLogger(LogController.class);
    @RequestMapping("/test")
    public String testLog(){
        logger.error("=====测试日志error级别打印====");
        logger.warn("======测试日志warn级别打印=====");
        logger.info("=====测试日志info级别打印====");
        logger.debug("======测试日志debug级别打印=====");
        logger.trace("======测试日志trace级别打印=====");
        String str1="111111111111111";
        String str2="222222222222222";
        logger.info("=======测试:{}{}",str1,str2);
        return "success";

    }

}
