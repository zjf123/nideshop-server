package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dao.NideshopCategoryMapper;
import com.hunhot.nideshop.entity.NideshopCategory;
import com.hunhot.nideshop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopCategoryMapper nideshopCategoryMapper;

	@Override
	public List<NideshopCategory> selectCategorysByCondition(NideshopCategory category, int offset, int limit) {
		return nideshopCategoryMapper.selectCategorysByCondition(category,offset,limit);
	}

	public List<Integer> selectCategoryIdsByCondition(NideshopCategory category, int offset, int limit){
		return nideshopCategoryMapper.selectCategoryIdsByCondition(category,offset,limit);
	}
}
