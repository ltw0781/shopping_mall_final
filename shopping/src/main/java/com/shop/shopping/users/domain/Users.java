package com.shop.shopping.users.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Users {

    private int userNo;
    private String userId;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String address;
    private int enabled;
    private Date createdAt;
    private Date updatedAt;
    
}
