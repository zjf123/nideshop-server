package com.hunhot.nideshop.service;

import com.hunhot.nideshop.entity.NideshopGoods;
import com.hunhot.nideshop.entity.NideshopGoodsSpecification;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface GoodsSpecificationService {

	/**
	 *
	 * @param goods
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<NideshopGoodsSpecification> selectGoodsByCondition(NideshopGoodsSpecification goods, int offset, int limit);


	NideshopGoodsSpecification selectGoodsById(int id);
}
