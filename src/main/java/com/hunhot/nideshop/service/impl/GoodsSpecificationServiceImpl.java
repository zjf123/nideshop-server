package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dao.NideshopGoodsMapper;
import com.hunhot.nideshop.dao.NideshopGoodsSpecificationMapper;
import com.hunhot.nideshop.entity.NideshopGoods;
import com.hunhot.nideshop.entity.NideshopGoodsSpecification;
import com.hunhot.nideshop.service.GoodsService;
import com.hunhot.nideshop.service.GoodsSpecificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsSpecificationServiceImpl implements GoodsSpecificationService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopGoodsSpecificationMapper goodsSpecificationMapper;

	@Override
	public List<NideshopGoodsSpecification> selectGoodsByCondition(NideshopGoodsSpecification goods, int offset, int limit) {
		goods.setOffset(offset);
		goods.setLimit(limit);
		return goodsSpecificationMapper.selectNideshopGoodsSpecificationByCondition(goods);
	}

	@Override
	public NideshopGoodsSpecification selectGoodsById(int id) {
		return goodsSpecificationMapper.selectByPrimaryKey(id);
	}
}
