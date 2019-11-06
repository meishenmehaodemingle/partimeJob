package com.vip.items.controller;

import com.vip.items.domain.entity.Programmer;
import com.vip.items.domain.vo.AllProgrammers;
import com.vip.items.domain.vo.ProgrammerPageVo;
import com.vip.items.service.ProgrammerService;
import com.vip.items.utils.Result;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


/**
 * @author dell
 */
@RestController
@RequestMapping("/programmer")
public class Index2Controller {
    @Resource
    ProgrammerService programmerService;


    /**
     * 根据页数找记录
     * @param page
     * @return
     */
    @RequestMapping("/findSixProgrammers")
    public Result findSixProgrammers(int page){
        try {
            ProgrammerPageVo<Programmer> sixProgrammers = programmerService.findSixProgrammers(page);
            return Result.success(sixProgrammers);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 查排行榜
     * @return
     */
    @RequestMapping("/findOrderProgrammers")
    public Result findOrderProgrammers(){
        try {
            List<Programmer> programmers = programmerService.findProgrammersOrderByIncome();
            return Result.success(programmers);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 分页第一页
     * @return
     */
    @RequestMapping("/first")
    public Result findFirst(){
        try {
            ProgrammerPageVo<Programmer> sixProgrammers = programmerService.findSixProgrammers(1);
            return Result.success(sixProgrammers);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 查询uid的所有信息
     * @param uid
     * @return
     */
    @RequestMapping("/findAllProgrammers")
    public Result findAllProgrammers(int uid){
        try {
            AllProgrammers allProgrammers = programmerService.findAllProgrammers(uid);
            return Result.success(allProgrammers);
        } catch (Exception e) {
            return Result.error();
        }
    }


    /**
     * 根据uid，pid添加信息
     * @param uid
     * @param pid
     * @return
     */
    @RequestMapping(value = "/collectProgrammer",params = {"uid","pid"})
    public Result collectProgrammer(int uid,int pid){
        try {
            Integer integer = programmerService.saveProgrammer(uid, pid);
            return Result.success(integer);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * 根据uid，pid删除
     * @param uid
     * @param pid
     * @return
     */
    @RequestMapping(value = "/deleteProgrammer",params = {"uid","pid"})
    public Result deleteProgrammer(int uid,int pid){
        try {
            Integer integer = programmerService.deleteProgrammer(uid, pid);
            return Result.success(integer);
        } catch (Exception e) {
            return Result.error();
        }
    }

}
