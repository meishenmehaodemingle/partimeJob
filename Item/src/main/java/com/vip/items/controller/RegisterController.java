package com.vip.items.controller;

import com.vip.items.domain.entity.User;
import com.vip.items.service.LoginService;
import com.vip.items.service.RegisterService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author acer
 * 注册功能
 */
@RestController
@Slf4j
public class RegisterController {
    @Resource
    RegisterService registerService;
    @Resource
    LoginService loginService;

    @GetMapping("/register")
    public Result<Integer> register(String username, String password,
                                    String email, String utel){
        try {
            //用户名  中文 下划线 字母 数字 长度4-8
            String usernameRegex = "[\\u4e00-\\u9fa5_a-zA-Z0-9]{4,8}";
            //密码  字符 数字 长度8-20
            String passwordRegex = "[a-zA-Z0-9]{8,20}";
            //手机号码  11位纯数字，必须是12、13、14、15、17、18开头
            String utelRegex = "1[234578][0-9]{9}";
            //字母数字组合(6到20位) + @ + 字母数字组合(2到6位) + .com或.cn
            String emailRegex = "[a-zA-Z0-9]{6,20}@[a-zA-Z0-9]{2,6}\\.(com|cn)";

            if (username.matches(usernameRegex)
                    && password.matches(passwordRegex)
                    && utel.matches(utelRegex)){
                //查看用户表是否有该username
                User user = loginService.getUser(username);
                if (user == null || "".equals(user)){
                    if (email == null || "".equals(email)){
                        int i = registerService.insertUser(username, password, email, utel);
                        return Result.success(i);
                    }else {
                        //邮箱不为空的时候  判断是否匹配emailRegex
                        if (email.matches(emailRegex)){
                            int i = registerService.insertUser(username, password, email, utel);
                            return Result.success(i);
                        }
                    }
                }else {
                    log.error("该用户已存在");
                }
            }else {
                log.error("必填信息不符合规则");
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
