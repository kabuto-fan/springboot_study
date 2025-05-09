package com.kabuto.springboot_study.common;

import lombok.Data;

@Data
public class JsonResult <T> {
    private T data;
    private String code;
    private String msg;

    /*如果没有返回数据，默认成功，成功响应码200，返回信息 操作成功*/
    public JsonResult(){
        this.code="200";
        this.msg="操作成功!";
    }
    /*没有返回数据，可以自定义信息*/
    public JsonResult(String code,String msg){
        this.code=code;
        this.msg=msg;
    }
    /*有数据返回，状态码200，提示信息 操作成功！*/
    public JsonResult(T data){
        this.data=data;
        this.code="200";
        this.msg="操作成功!";
    }
    /*有数据返回，状态码200，自定义提示信息*/
    public JsonResult(T data,String msg){
        this.data=data;
        this.code="200";
        this.msg=msg;

    }

}
