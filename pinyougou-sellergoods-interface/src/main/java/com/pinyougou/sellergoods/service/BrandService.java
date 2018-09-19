package com.pinyougou.sellergoods.service;

import java.util.List;
import java.util.Map;

import com.pinyougou.pojo.TbBrand;

import entity.PageResult;

public interface BrandService {
	
	public List<TbBrand> findAll();
	
	public PageResult findPage(int pageNum ,int pageSize);
	
	public void save(TbBrand brand);
	public void update(TbBrand brand);
	
	public TbBrand findOne(Long id);
	
	public void deleat(Long[] ids);
	
	public PageResult findPage(TbBrand brand , int pageNum ,int pageSize);
	
	List<Map> selectOptionList();
 
}
