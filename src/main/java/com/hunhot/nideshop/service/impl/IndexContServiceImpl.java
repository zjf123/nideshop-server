package com.hunhot.nideshop.service.impl;

import com.hunhot.nideshop.dao.NideshopAdMapper;
import com.hunhot.nideshop.entity.NideshopAd;
import com.hunhot.nideshop.entity.NideshopGoods;
import com.hunhot.nideshop.service.AdService;
import com.hunhot.nideshop.service.ChannelService;
import com.hunhot.nideshop.service.GoodsService;
import com.hunhot.nideshop.service.IndexContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class IndexContServiceImpl implements IndexContService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private AdService adService;
	@Autowired
	private ChannelService channelService;
	@Autowired
	private GoodsService goodsService;

	@Override
	public ModelAndView getIndexData() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("banner",adService.selectByAdPositionId((short)1));
		mav.addObject("channel",channelService.selectAllChannels());

		NideshopGoods newGoods = new NideshopGoods();
		newGoods.setIsNew(1);
		mav.addObject("newGoodsList",goodsService.selectGoodsByCondition(newGoods,1,4));
		NideshopGoods hotGoods = new NideshopGoods();
		hotGoods.setIsHot(1);
		mav.addObject("hotGoodsList",goodsService.selectGoodsByCondition(hotGoods,1,3));

		return mav;
	}
}
