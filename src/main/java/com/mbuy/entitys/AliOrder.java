package com.mbuy.entitys;

import java.io.Serializable;

public class AliOrder implements Serializable {
    private Integer id;

    private String aliWangwang;

    private Integer goodsNum;

    private String aliPhone;

    private String aliAddress;

    private String aliRemark;

    private String aliProduct;

    private Long aliMoney;

    private String aliImgs;

    private String design;

    private String pack;

    private Integer addTime;

    private Integer updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAliWangwang() {
        return aliWangwang;
    }

    public void setAliWangwang(String aliWangwang) {
        this.aliWangwang = aliWangwang == null ? null : aliWangwang.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getAliPhone() {
        return aliPhone;
    }

    public void setAliPhone(String aliPhone) {
        this.aliPhone = aliPhone == null ? null : aliPhone.trim();
    }

    public String getAliAddress() {
        return aliAddress;
    }

    public void setAliAddress(String aliAddress) {
        this.aliAddress = aliAddress == null ? null : aliAddress.trim();
    }

    public String getAliRemark() {
        return aliRemark;
    }

    public void setAliRemark(String aliRemark) {
        this.aliRemark = aliRemark == null ? null : aliRemark.trim();
    }

    public String getAliProduct() {
        return aliProduct;
    }

    public void setAliProduct(String aliProduct) {
        this.aliProduct = aliProduct == null ? null : aliProduct.trim();
    }

    public Long getAliMoney() {
        return aliMoney;
    }

    public void setAliMoney(Long aliMoney) {
        this.aliMoney = aliMoney;
    }

    public String getAliImgs() {
        return aliImgs;
    }

    public void setAliImgs(String aliImgs) {
        this.aliImgs = aliImgs == null ? null : aliImgs.trim();
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design == null ? null : design.trim();
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", aliWangwang=").append(aliWangwang);
        sb.append(", goodsNum=").append(goodsNum);
        sb.append(", aliPhone=").append(aliPhone);
        sb.append(", aliAddress=").append(aliAddress);
        sb.append(", aliRemark=").append(aliRemark);
        sb.append(", aliProduct=").append(aliProduct);
        sb.append(", aliMoney=").append(aliMoney);
        sb.append(", aliImgs=").append(aliImgs);
        sb.append(", design=").append(design);
        sb.append(", pack=").append(pack);
        sb.append(", addTime=").append(addTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}