package com.pinyougou.manager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
@RestController
@RequestMapping("/brand")
public class BrandController {
	@Reference
	private BrandService service;
	
	@RequestMapping("/findAll")
	public List<TbBrand> findAll(){
		return service.findAll();
	}
	
}