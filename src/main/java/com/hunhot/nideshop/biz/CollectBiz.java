package com.hunhot.nideshop.biz;

import com.hunhot.nideshop.entity.NideshopCollect;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface CollectBiz {

	/**
	 *
	 * @param collect
	 * @param offset
	 * @param limit
     * @return
     */
	List<NideshopCollect> selectCollectsByCondition(NideshopCollect collect, int offset, int limit);

	List<NideshopCollect> selectCollectsRelationGoodsByCondition(NideshopCollect collect, int offset, int limit);

	NideshopCollect selectCollectById(int id);
}
