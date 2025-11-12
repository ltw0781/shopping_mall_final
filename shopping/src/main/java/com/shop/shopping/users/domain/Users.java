package com.shop.shopping.users.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Users {
    
    private int userNo;         // 유저 번호
    private String userId;      // 유저 ID
    private String password;    // 비밀번호
    private String name;        // 이름
    private String email;       // 이메일
    private String address;       // 이메일
    private int enabled;        // 활성화 조건
    private Date createdAt;     // 등록일
    private Date updatedAt;     // 수정일 ?
    
}
