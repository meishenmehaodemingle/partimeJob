package com.vip.items.controller;

import com.vip.items.domain.entity.User;
import com.vip.items.service.LoginService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author acer
 * 登录功能
 */
@RestController
@Slf4j
public class LoginController {
    @Resource
    LoginService loginService;
    @GetMapping("/login")
    public Result<User> login(String username, String password){
        log.error(username,password);
        try {
            //查看该用户是否存在
            User user = loginService.getUser(username);
            if (user != null){
                //密码是否正确
                if (user.getPassword().equals(password)){
                    return Result.success(user);
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
