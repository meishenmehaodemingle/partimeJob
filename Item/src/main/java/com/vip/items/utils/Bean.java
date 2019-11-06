package com.vip.items.utils;

import com.vip.items.domain.entity.*;
import com.vip.items.domain.vo.CategoryVo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Bean implements Serializable {
		List<Project> projectMappers;
		List<Category> categorylist;
		List<SubMenu2> subMenu2s;
		List<SubMenu3> subMenu3s;
		int collection;
		User user;


}
