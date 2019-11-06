package com.vip.items.service;

public interface RegisterService {
    int insertUser(String username, String password,
                   String email, String utel);
}
