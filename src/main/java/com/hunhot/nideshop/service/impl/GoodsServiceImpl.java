package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dao.NideshopAdMapper;
import com.hunhot.nideshop.dao.NideshopGoodsMapper;
import com.hunhot.nideshop.entity.NideshopAd;
import com.hunhot.nideshop.entity.NideshopGoods;
import com.hunhot.nideshop.service.AdService;
import com.hunhot.nideshop.service.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private NideshopGoodsMapper nideshopGoodsMapper;


	@Override
	public List<NideshopGoods> selectGoodsByCondition(NideshopGoods goods, int offset, int limit) {
		return nideshopGoodsMapper.selectGoodsByCondition(goods,offset,limit);
	}
}
