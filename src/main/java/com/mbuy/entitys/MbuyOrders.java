package com.mbuy.entitys;

import java.io.Serializable;
import java.math.BigDecimal;

public class MbuyOrders implements Serializable {
    private Integer id;

    private String orderSn;

    private Integer userId;

    private String shippingType;

    private BigDecimal installPrice;

    private BigDecimal discountAmount;

    private BigDecimal goodsPrice;

    private BigDecimal totalPrice;

    private Integer installDate;

    private Integer createDate;

    private Integer editDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType == null ? null : shippingType.trim();
    }

    public BigDecimal getInstallPrice() {
        return installPrice;
    }

    public void setInstallPrice(BigDecimal installPrice) {
        this.installPrice = installPrice;
    }

    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Integer installDate) {
        this.installDate = installDate;
    }

    public Integer getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Integer createDate) {
        this.createDate = createDate;
    }

    public Integer getEditDate() {
        return editDate;
    }

    public void setEditDate(Integer editDate) {
        this.editDate = editDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", userId=").append(userId);
        sb.append(", shippingType=").append(shippingType);
        sb.append(", installPrice=").append(installPrice);
        sb.append(", discountAmount=").append(discountAmount);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", installDate=").append(installDate);
        sb.append(", createDate=").append(createDate);
        sb.append(", editDate=").append(editDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}