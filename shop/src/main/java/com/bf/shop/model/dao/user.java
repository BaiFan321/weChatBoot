package com.bf.shop.model.dao;

import lombok.Data;

@Data
public class user {
    private Integer id;
    private String username;
    private String password;
    private String personalizeSignature;
    private String role;
}
