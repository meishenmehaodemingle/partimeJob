package com.vip.items.service.impl;

import com.vip.items.domain.entity.User;
import com.vip.items.mapper.UserMapper;
import com.vip.items.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author song
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User findDetail(int uid) {
        return userMapper.findDetail(uid);
    }
}
