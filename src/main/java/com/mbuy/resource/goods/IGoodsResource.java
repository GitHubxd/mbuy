package com.mbuy.resource.goods;

import com.mbuy.model.GoodsVo;
import com.mbuy.utils.CommonResponse;

/**
 * 商品相关
 * 
 * @author 37523
 *
 */
public interface IGoodsResource {

	CommonResponse getAllGoods();

	/**
	 * 增加商品
	 * 
	 * @param goodsVo
	 * @return
	 */
	CommonResponse addGoods(GoodsVo goodsVo);
}

