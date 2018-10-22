package com.mbuy.model;

import java.util.List;

import com.mbuy.entitys.MbuyOrders;

/**
 * 订单VO
 * 
 * @author 37523
 *
 */
public class OrderVo extends MbuyOrders {

	private List<OrderGoodsVo> goodsList;

	/**
	 * @return the goodsList
	 */
	public List<OrderGoodsVo> getGoodsList() {
		return goodsList;
	}

	/**
	 * @param goodsList the goodsList to set
	 */
	public void setGoodsList(List<OrderGoodsVo> goodsList) {
		this.goodsList = goodsList;
	}

}
