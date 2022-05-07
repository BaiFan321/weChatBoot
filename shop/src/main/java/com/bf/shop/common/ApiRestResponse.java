package com.bf.shop.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiRestResponse<T> {

    private Integer status;

    private String msg;

    private T data;

    private static final int OK_CODE=10000;

    private static final String OK_MSG="SUCCESS";
}
