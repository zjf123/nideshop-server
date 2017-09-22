package com.hunhot.nideshop.web;

import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.service.BrandContService;
import com.hunhot.nideshop.service.CollectContService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/brand") // url:/模块/资源/{id}/细分 /seckill/list
public class CollectController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CollectContService collectContService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	private HashMap listAction(int typeId) {
		Result<HashMap> result = collectContService.getListData(typeId);
		return result.getData();
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	private HashMap addordeleteAction(int typeId,int valueId) {
		Result<HashMap> result = collectContService.getAddordeleteData(typeId,valueId);
		return result.getData();
	}

}
