package com.hunhot.nideshop.service;

import com.hunhot.nideshop.entity.NideshopCategory;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface CategoryService {

	/**
	 *
	 * @param category
	 * @param offset
	 * @param limit
     * @return
     */
	List<NideshopCategory> selectCategorysByCondition(NideshopCategory category, int offset, int limit);

	/**
	 *
	 * @param category
	 * @param offset
	 * @param limit
     * @return
     */
	List<Integer> selectCategoryIdsByCondition(NideshopCategory category, int offset, int limit);

	/**
	 * 根据ID查询category
	 * @param categoryId
	 * @return
	 */
	NideshopCategory selectCategoryById(int categoryId);
}
