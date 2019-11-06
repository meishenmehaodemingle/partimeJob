package com.vip.items.controller;

import com.vip.items.service.ProjectService;
import com.vip.items.utils.Result;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;

@RestController
public class ProjectController {
    @Resource
    ProjectService projectService;
    @GetMapping("/project")
    public Result showProjectDetail(int proId){
        try {
            return Result.success(projectService.getDetail(proId));
        } catch (Exception e) {
            return Result.error();
        }
    }
    @GetMapping("/reform")
    public Result saveProject(String proName,String proCom,
                              String proRequest,String tel,
                              String time,Integer cateId,Integer menu2Id,Integer menu3Id){
        try {
            if(proName==null||proName.equals("")){
                throw new RuntimeException("项目名不能为空");
            }else if(proCom==null||proCom.equals("")){
                    throw new RuntimeException("公司名不能为空");
            }else if(time==null||time.equals("")){
                throw new RuntimeException("要求时间不能为空");
            }else if(cateId==null||cateId.equals("")){
                throw new RuntimeException("项目分类不能为空");
            }else if(menu2Id==null||menu2Id.equals("")){
                throw new RuntimeException("项目预算不能为空");
            }else if(menu3Id==null||menu3Id.equals("")){
                throw new RuntimeException("项目指定地区不能为空");
            }else if(proRequest==null||proRequest.equals("")){
                throw new RuntimeException("项目指定地区不能为空");
            }else if(!tel.matches("1[345789][0-9]{9}")){
                throw new RuntimeException("电话号码格式不正确");
            }
            return Result.success(projectService.save(proName,proCom,
                    proRequest,tel, time,cateId,menu2Id,menu3Id));
        } catch (Exception e) {
            return Result.error();
        }
    }
}
