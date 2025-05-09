package com.kabuto.springboot_study.controller;

import com.kabuto.springboot_study.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/user")
    public User getUser(){
        return new User(1L,"kabuto","123456");

    }
    @RequestMapping("/usermap")
    public Map<String,Object> getUserMap(){
        Map<String, Object> userMap = new HashMap<>(3);
        User user = new User(1, "kabuto", "123");
        User user2 = new User(2, "faiz", null);


//        userMap.put("英雄信息",user);
        userMap.put("英雄信息",user2);
        userMap.put("战力","SSS");
//        userMap.put("挚友","FAIZ");
        userMap.put("挚友",null);

        return userMap;
    }
    @RequestMapping("/userList")
    public List<User> getUserList(){
        User kabuto = new User(1, "kabuto", "123");
        User faiz = new User(2, "faiz", "456");
        List<User> list = new ArrayList<>();
        list.add(kabuto);
        list.add(faiz);

        return list;
    }
}
