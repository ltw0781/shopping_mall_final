package com.shop.shopping.users.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
 * UserDetailsService : 사용자 정보 불러오는 인터페이스
 * 이 인터페이스를 구현하여, 사용자 정보를 로드하는 방법을 정의할 수 있다
 */
@Slf4j
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
    }
    
}
