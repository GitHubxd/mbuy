package com.mbuy.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.entitys.MbuyGoods;
import com.mbuy.mapper.MbuyGoodsMapper;
import com.mbuy.utils.CommonResponse;

/**
 * 商品相关服务
 * 
 * @author 37523
 *
 */
@Service
public class GoodsService {

	@Autowired
	private MbuyGoodsMapper goodsMapper;

	public CommonResponse getAllGoods() {
		CommonResponse commonResponse = CommonResponse.getInstance();
		List<MbuyGoods> list = goodsMapper.selectAll();
		commonResponse.setResult(list);
		return commonResponse;
	}
}
