package com.hunhot.nideshop.web;

import com.hunhot.nideshop.dto.Result;
import com.hunhot.nideshop.service.CartContService;
import com.hunhot.nideshop.service.CatalogContService;
import com.hunhot.nideshop.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;

@Controller
@RequestMapping("/catalog") // url:/模块/资源/{id}/细分 /seckill/list
public class CatalogController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CatalogContService catalogContService;

	/**
	 * 获取分类栏目数据
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	private HashMap indexAction(int id) {
		Result<HashMap> result = catalogContService.getIndexData(id);
		return result.getData();
	}

	@RequestMapping(value = "/current", method = RequestMethod.GET)
	private HashMap currentAction(int id) {
		Result<HashMap> result = catalogContService.currentAction(id);
		return result.getData();
	}

}
