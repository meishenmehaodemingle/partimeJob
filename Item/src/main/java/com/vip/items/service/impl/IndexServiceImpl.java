package com.vip.items.service.impl;

import com.vip.items.domain.entity.*;
import com.vip.items.domain.vo.CategoryVo;
import com.vip.items.mapper.*;
import com.vip.items.service.IndexService;
import com.vip.items.utils.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {
		@Resource
		CategoryMapper categoryMapper;
		@Resource
		ProjectMapper projectMapper;
		@Resource
		SubMenu2Mapper subMenu2Mapper;
		@Resource
		SubMenu3Mapper subMenu3Mapper;
		@Resource
		Collection1Mapper collection1Mapper;
		@Resource
		UserMapper userMapper;

		@Override
		public Bean find2() {
				Bean bean = new Bean();
				List<Category> all = categoryMapper.findAll();
				bean.setCategorylist(all);
				return bean;
		}

		@Override
		public Bean find3(int cateId,int menu2Id,int menu3Id) {
				Bean bean = new Bean();
				List<Project> all = projectMapper.findAll(cateId,menu2Id,menu3Id);
			bean.setProjectMappers(all);
			return bean;
		}

		@Override
		public Bean find4() {
				Bean bean = new Bean();
				List<SubMenu2> all = subMenu2Mapper.findAll();
				bean.setSubMenu2s(all);
				return bean;
		}

		@Override
		public Bean find5() {
				Bean bean = new Bean();
				List<SubMenu3> all = subMenu3Mapper.findAll();
				bean.setSubMenu3s(all);
				return bean;
		}

		@Override
		public Bean find6() {
				Bean bean = new Bean();
				List<Project> display = projectMapper.findDisplay();
				bean.setProjectMappers(display);
				return bean;
		}

		@Override
		public Bean find7() {
				Bean bean = new Bean();
				List<Category> projevt = categoryMapper.findProjevt();
				bean.setCategorylist(projevt);
				return bean;
		}

		@Override
		public Bean find8(int cateId,int menu2Id,int menu3Id) {
				Bean bean = new Bean();
				List<Category> project = categoryMapper.findProject(cateId, menu2Id, menu3Id);
				bean.setCategorylist(project);
				return bean;
		}

		@Override
		public Bean find9(int proid,int uid, int isDelete) {
				Bean bean = new Bean();
				Collection1 byId = collection1Mapper.findById(proid);
				if (byId!=null){
						int update = collection1Mapper.updateByProid(proid, isDelete);
						bean.setCollection(update);
						return bean;
				}else {
						int row = collection1Mapper.add(proid,uid, isDelete);
						bean.setCollection(row);
						return bean;
				}
		}


		@Override
		public Bean find10(int cid,int isDelete) {
				Bean bean = new Bean();
				int row = collection1Mapper.update(cid,isDelete);
				bean.setCollection(row);
				return bean;
		}

		@Override
		public Bean find11(int isDelete) {
				Bean bean = new Bean();
				List<Project> collect = projectMapper.findCollect(isDelete);
				bean.setProjectMappers(collect);
				return bean;
		}

		@Override
		public Bean find12(int uid) {
				Bean bean = new Bean();
				User user = userMapper.userById(uid);
				bean.setUser(user);
				return bean;

		}

	@Override
	public Bean find13() {
		Bean bean = new Bean();
		List<Category> projects = categoryMapper.findProjects();
		bean.setCategorylist(projects);
		return bean;
	}
}
