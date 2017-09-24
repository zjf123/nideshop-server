package com.hunhot.nideshop.web;

import com.hunhot.nideshop.utils.Result;
import com.hunhot.nideshop.service.GoodsContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/goods") // url:/模块/资源/{id}/细分 /seckill/list
public class GoodsController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private GoodsContService goodsContService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public HashMap indexAction(Model model) {
		Result<HashMap> result = goodsContService.getIndexData();
		return result.getData();
	}

	@RequestMapping(value = "/sku", method = RequestMethod.GET)
	public HashMap skuAction(int id) {
		Result<HashMap> result = goodsContService.skuAction(id);
		return result.getData();
	}



}
