package com.mbuy.service.aligoods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.entitys.AliGoods;
import com.mbuy.entitys.AliGoodsExample;
import com.mbuy.mapper.AliGoodsMapper;
import com.mbuy.utils.CommonResponse;

@Service
public class AliGoodsService {

	@Autowired
	private AliGoodsMapper goodsMapper;
	
	public CommonResponse addGoods(AliGoods goods) {
		CommonResponse res = CommonResponse.getInstance();
		goodsMapper.insertSelective(goods);
		return res;
	}
	
	public CommonResponse getAll() {
		CommonResponse res = CommonResponse.getInstance();
		AliGoodsExample example = new AliGoodsExample();
		List<AliGoods> list = goodsMapper.selectByExample(example);
		res.setResult(list);
		return res;
	}
}
