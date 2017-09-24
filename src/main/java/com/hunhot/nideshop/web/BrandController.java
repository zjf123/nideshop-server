package com.hunhot.nideshop.web;

import com.hunhot.nideshop.utils.Result;
import com.hunhot.nideshop.service.BrandContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/brand") // url:/模块/资源/{id}/细分 /seckill/list
public class BrandController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BrandContService brandContService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private HashMap listAction(int page,int size) {
		Result<HashMap> result = brandContService.getListData(page,size);
		return result.getData();
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	private HashMap detailAction(int id) {
		Result<HashMap> result = brandContService.getDetailData(id);
		return result.getData();
	}

}
