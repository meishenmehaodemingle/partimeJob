package com.vip.items.mapper;
import com.vip.items.domain.entity.Project;
import com.vip.items.domain.vo.ProjectVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    ProjectVo findByproId(int proId);
    int saveProject(String proName, String proCom,
                    String proRequest, String tel,
                    String time, int cateId, int menu2Id, int menu3Id);


    List<ProjectVo> findByKeyword(@Param("keyword") String keyword);

    List<Project> findAll(@Param("cateId")int cateId,
                          @Param("menu2Id")int menu2Id,
                          @Param("menu3Id")int menu3Id);
    List<Project>  findDisplay();

    List<Project>  findCollect(@Param("isDelete")int isDelete);
}