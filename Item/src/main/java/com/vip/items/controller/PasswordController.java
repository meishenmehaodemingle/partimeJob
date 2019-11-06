package com.vip.items.controller;

import com.vip.items.domain.entity.User;
import com.vip.items.service.LoginService;
import com.vip.items.service.PasswordService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author acer
 * 修改密码
 */
@RestController
@Slf4j
public class PasswordController {
    @Resource
    PasswordService passwordService;
    @Resource
    LoginService loginService;
    @GetMapping("password")
    public Result<Integer> updatePassword(String username, String password, String newPassword){
        try {
            //用户名是否存在
            User user = loginService.getUser(username);
            if (user != null){
                String regex = "[a-zA-Z0-9]{8,20}";
                //旧密码是否正确  新密码是否符合规则
                if (user.getPassword().equals(password) && newPassword.matches(regex)){
                    int i = passwordService.updatePassword(username, password, newPassword);
                    return Result.success(i);
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
