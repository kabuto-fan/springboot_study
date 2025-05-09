package com.kabuto.springboot_study.controller;

import com.kabuto.springboot_study.common.JsonResult;
import com.kabuto.springboot_study.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/jsonresult")
public class JsonResultController {
    @RequestMapping("/user")
    public JsonResult<User> getUser(){
        User user= new User(1,"kabuto","666");
        return new JsonResult<>(user);
    }
    @RequestMapping("/list")
    public JsonResult<List> getUserList(){
        User user= new User(1,"kabuto","666");
        User user2= new User(2,"faiz","555");
        ArrayList<User> list = new ArrayList<>();
        list.add(user);
        list.add(user2);
        return new JsonResult<>(list,"变身！");
    }
    @RequestMapping("/map")
    public JsonResult<Map> getUserMap(){
        Map<String,Object> map = new HashMap<>();
        User user= new User(1,"kabuto","666");
        map.put("骑士信息",user);
        map.put("挚友","faiz");
        map.put("配偶",null);
        return new JsonResult<>(map,"牛逼");
    }

}
