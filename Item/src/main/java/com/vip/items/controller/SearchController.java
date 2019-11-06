package com.vip.items.controller;

import com.vip.items.domain.entity.Project;
import com.vip.items.domain.vo.AllProgrammers;
import com.vip.items.domain.vo.ProjectVo;
import com.vip.items.service.ProgrammerService;
import com.vip.items.service.SearchService;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author song
 */
@RestController
@Slf4j
@RequestMapping("/search")
public class SearchController {

    @Resource
    ProgrammerService programmerService;
    @Resource
    SearchService searchService;

    /**
     * 根据关键字查询记录
     * @param keyword
     * @param uid
     * @return
     */
    @RequestMapping(value = "/programmers",params = {"keyword","uid"})
    public Result searchProgrammers(String keyword,int uid){
        try {
            AllProgrammers allProgrammers = programmerService.searchProgrammers(keyword,uid);
            return Result.success(allProgrammers);
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**
     * @param keyword
     * @return
     * 根据关键字(项目名称或者项目要求)查找项目
     */
    @RequestMapping("/searchProject")
    public Result<List<Project>> search(String keyword){
        try {
            List<ProjectVo> projects = searchService.search(keyword);
            return Result.success(projects);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
