package com.vip.items.service.impl;

import com.vip.items.mapper.UserMapper;
import com.vip.items.service.PasswordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PasswordServiceImpl implements PasswordService {
    @Resource
    UserMapper userMapper;
    @Override
    public int updatePassword(String username, String password, String newPassword) {
        int i = userMapper.updatePassword(username, password, newPassword);
        return i;
    }
}
