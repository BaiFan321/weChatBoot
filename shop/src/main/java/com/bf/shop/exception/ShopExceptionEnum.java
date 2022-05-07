package com.bf.shop.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum ShopExceptionEnum {

        NEED_USER_NAME(10001,"用户名不能为空");


        Integer code;
        String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
