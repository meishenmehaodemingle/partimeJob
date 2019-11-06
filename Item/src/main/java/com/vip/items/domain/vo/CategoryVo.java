package com.vip.items.domain.vo;

import com.vip.items.domain.entity.Category;
import com.vip.items.domain.entity.Project;
import lombok.Data;

import java.util.List;

@Data
public class CategoryVo extends Category {
		List<Project> projectList;
}

