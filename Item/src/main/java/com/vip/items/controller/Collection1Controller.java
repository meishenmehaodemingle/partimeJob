package com.vip.items.controller;

import com.vip.items.domain.entity.Collection1;
import com.vip.items.service.Collecction1Service;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class Collection1Controller {
    @Resource
    Collecction1Service collecction1Service;

    /**
     * @param uid
     * @param proid
     * @return
     * 根据用户id和项目id查找收藏表的项目
     */
    @GetMapping("findCollection1")
    public Result<Collection1> findCollection1(Integer uid,Integer proid){
        try {
            if (uid > 0){
                Collection1 collection1 = collecction1Service.getCollection1(uid, proid);
                if (collection1 != null){
                    return Result.success(collection1);
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * @param uid
     * @param proid
     * @return
     * 往收藏表里添加项目
     */
    @GetMapping("addCollection1")
    public Result<Integer> addCollection1(int uid,int proid){
        try {
            if (uid > 0){
                int i = collecction1Service.addCollection1(uid, proid);
                return Result.success(i);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    /**
     * @param uid
     * @param proid
     * @return
     * 删除收藏表的某条数据(假删除)
     */
    @GetMapping("updateCollection1")
    public Result<Integer> updateCollection1(int uid,int proid){
        try {
            if (uid > 0){
                int i = collecction1Service.updateCollection1(uid, proid);
                return Result.success(i);
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}

