package com.pinyougou.manager.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;

import entity.PageResult;
import entity.Result;
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService service;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return service.findAll();
	}
	@RequestMapping("/findPage")
	public PageResult findPage(int page,int rows) {
	
		return service.findPage(page, rows);
		
	}
	
	@RequestMapping("/add")
	public Result add(@RequestBody TbBrand brand) {
		try {
			service.save(brand);
			return new Result(true, "添加成功");
		} catch (Exception e) {
			
			e.printStackTrace();
			return new Result(false, "添加失败");
		}
		
	}
	@RequestMapping("/update")
	public Result update(@RequestBody TbBrand brand) {
		try {
			service.update(brand);
			
			return new Result(true, "修改成功");
		} catch (Exception e) {
			
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
		
	}
	
	
	@RequestMapping("/findOne")
	public TbBrand findOne( Long id) {
	return service.findOne(id);
	
	}
	
	@RequestMapping("/deleat")
	public Result deleat(Long[] ids) {
		try {
			service.deleat(ids);
			
			return new Result(true, "删除成功");
		} catch (Exception e) {
			
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
		
	}
	@RequestMapping("/search")
	public PageResult findPage(@RequestBody  TbBrand brand ,int page,int rows) {
		return	 service.findPage(brand, page, rows);
	}
	@RequestMapping("/selectOptionList")
	public List<Map> selectOptionList(){
		return service.selectOptionList();
	}
	
}
