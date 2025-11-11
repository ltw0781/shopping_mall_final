package com.shop.shopping.users.service;

import com.shop.shopping.users.domain.UserAuth;
import com.shop.shopping.users.domain.Users;

public interface UsersService {
    
    // 로그인
    public Users login(String userId) throws Exception;

    // 회원조회
    public Users select(String userId) throws Exception;

    // 회원가입
    public int join (Users user) throws Exception;

    // 회원수정
    public int update(Users user) throws Exception;

    // 마이페이지 수정
    public int MyUpdate(Users user) throws Exception;

    // 회원권한 등록
    public int insertAuth(UserAuth userAuth) throws Exception;

}
