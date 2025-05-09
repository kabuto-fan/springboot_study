package com.kabuto.springboot_study.entity;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1L);
        user.setName("John");
        user.setPwd("30");
        System.out.println(user.getName()); // 应该输出 "John"
    }
}