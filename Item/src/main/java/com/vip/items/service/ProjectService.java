package com.vip.items.service;

import com.vip.items.domain.vo.ProjectVo;

public interface ProjectService {
    ProjectVo getDetail(int proId);
    int save(String proName, String proCom,
             String proRequest, String tel,
             String time, int cateId, int menu2Id, int menu3Id);
}
