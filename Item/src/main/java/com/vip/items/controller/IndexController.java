package com.vip.items.controller;

import com.vip.items.service.IndexService;
import com.vip.items.utils.Bean;
import com.vip.items.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/find")
public class IndexController {
		@Resource
		IndexService indexService;


		@GetMapping("/cate")
		public Result find2() {
				try {
						Bean finds = indexService.find2();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/pro")
		public Result find3(int cateId, int menu2Id, int menu3Id) {
				try {
						Bean finds = indexService.find3(cateId, menu2Id, menu3Id);
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/sub2")
		public Result find4() {
				try {
						Bean finds = indexService.find4();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/sub3")
		public Result find5() {
				try {
						Bean finds = indexService.find5();
						return Result.success(finds);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/Display")
		public Result find6() {
				try {
						Bean bean = indexService.find6();
						return Result.success(bean);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/finds")
		public Result find7() {
	try{
			Bean bean = indexService.find7();
			return Result.success(bean);
		} catch(Exception e){
				log.error(e.getMessage());
		}
				return Result.error();
   }
   @GetMapping("/des")
	 public Result find8(int cateId,int menu2Id,int menu3Id) {
			 try{
					 Bean bean = indexService.find8(cateId,menu2Id,menu3Id);
					 return Result.success(bean);
			 } catch(Exception e){
					 log.error(e.getMessage());
			 }
			 return Result.error();
	 }

	 @GetMapping("/add")
		public Result find9(int proid,int uid,int isDelete){
			 try {
					 Bean bean = indexService.find9(proid,uid, isDelete);
					 return Result.success(bean);
			 } catch (Exception e) {
					 log.error(e.getMessage());
			 }
			 return Result.error();
	 }

		@GetMapping("/update")
		public Result find10(int cid,int isDelete){
				try {
						Bean bean = indexService.find10(cid,isDelete);
						return Result.success(bean);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/collect")
		public Result find11(int isDelete){
				try {
						Bean bean = indexService.find11(isDelete);
						return Result.success(bean);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

		@GetMapping("/user")
		public Result find12(int uid){
				try {
						Bean bean = indexService.find12(uid);
						return Result.success(bean);
				} catch (Exception e) {
						log.error(e.getMessage());
				}
				return Result.error();
		}

	@GetMapping("/pros1")
	public Result find13(){
		try {
			Bean bean = indexService.find13();
			return Result.success(bean);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return Result.error();
	}

}
