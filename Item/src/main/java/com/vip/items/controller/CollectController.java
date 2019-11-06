package com.vip.items.controller;

import com.vip.items.domain.entity.Programmer;
import com.vip.items.domain.entity.User;
import com.vip.items.service.Collection2Service;
import com.vip.items.service.UserService;
import com.vip.items.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author song
 */
@RestController
@RequestMapping("/collect")
public class CollectController {

    @Resource
    Collection2Service collection2Service;
    @Resource
    UserService userService;

    /**
     * 查询所有uid收藏的记录
     * @param uid
     * @return
     */
    @RequestMapping("/programmers")
    public Result findProgrammersCollect(int uid){
        try {
            List<Programmer> programmers = collection2Service.findProgrammers(uid);
            return Result.success(programmers);
        } catch (Exception e) {
            return Result.error();
        }

    }

    @RequestMapping("/projects")
    public Result findProjectsCollect(int uid){
        return null;
    }

    @RequestMapping("/user")
    public Result findUserDetail(int uid){
        try {
            User user = userService.findDetail(uid);
            return Result.success(user);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
