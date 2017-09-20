package com.hunhot.nideshop.service;

import com.hunhot.nideshop.entity.NideshopBrand;
import com.hunhot.nideshop.entity.NideshopCart;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface CartService {

	/**
	 *
	 * @param cart
	 * @param offset
	 * @param limit
     * @return
     */
	List<NideshopCart> selectCartByCondition(NideshopCart cart, int offset, int limit);


}
