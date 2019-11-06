package com.vip.items.service.impl;

import com.vip.items.domain.vo.ProjectVo;
import com.vip.items.mapper.ProjectMapper;
import com.vip.items.service.ProjectService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    ProjectMapper projectMapper;
    @Override
    public ProjectVo getDetail(int proId) {
        ProjectVo projectVo = projectMapper.findByproId(proId);
        return projectVo;
    }

    @Override
    public int save(String proName, String proCom, String proRequest, String tel, String time, int cateId, int menu2Id, int menu3Id) {
        return projectMapper.saveProject(proName,proCom,
                proRequest,tel, time,cateId,menu2Id,menu3Id);
    }
}
