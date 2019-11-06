package com.vip.items.domain.vo;

import com.vip.items.domain.entity.Collection1;
import com.vip.items.domain.entity.Project;
import lombok.Data;

import java.util.List;

@Data
public class ProjectVo1 extends Project {
		List<Collection1> collection1List;
}
