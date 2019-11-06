package com.vip.items.mapper;

import com.vip.items.domain.entity.Category;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
		List<Category> findAll();

		List<Category> findProjevt();
		List<Category> findProject(@Param("cateId") int cateId,
                                   @Param("menu2Id") int menu2Id,
                                   @Param("menu3Id") int menu3Id);
	List<Category> findProjects();
}