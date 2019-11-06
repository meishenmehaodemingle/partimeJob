package com.vip.items.controller;

import com.vip.items.service.ProgrammerService;
import com.vip.items.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class ProgrammerController {
    @Resource
    ProgrammerService programmerService;
    @GetMapping("/programmer")
    public Result showProgrammerDetail(int pid){
        try {
            return Result.success(programmerService.getDetail(pid));
        } catch (Exception e) {
            return Result.error();
        }
    }
}
