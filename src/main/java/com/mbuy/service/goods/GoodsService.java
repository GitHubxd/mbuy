package com.mbuy.service.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbuy.entitys.MbuyGoods;
import com.mbuy.mapper.MbuyGoodsMapper;
import com.mbuy.model.GoodsVo;
import com.mbuy.utils.CommonResponse;
import com.mbuy.utils.ErrorCode;

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

	/**
	 * 获取所商品
	 * 
	 * @return
	 */
	public CommonResponse getAllGoods() {
		CommonResponse commonResponse = CommonResponse.getInstance();
		List<MbuyGoods> list = goodsMapper.selectAll();
		commonResponse.setResult(list);
		return commonResponse;
	}

	/**
	 * 增加新商品
	 * 
	 * @param goodsVo
	 * @return
	 */
	public CommonResponse addGoods(GoodsVo goodsVo) {
		int n = goodsMapper.insertSelective(goodsVo);
		CommonResponse commonResponse = CommonResponse.getInstance();
		if (n == 0) {
			commonResponse.setErrorCode(ErrorCode.ADD_ERROR_10020);
		}
		return commonResponse;
	}
}
