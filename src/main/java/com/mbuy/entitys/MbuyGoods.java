package com.mbuy.entitys;

import java.io.Serializable;
import java.math.BigDecimal;

public class MbuyGoods implements Serializable {
    private Integer id;

	private String goodsName;

    private BigDecimal goodsPrice;

    private BigDecimal levelPrice;

    private String spec;

    private String goodsImage;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public BigDecimal getLevelPrice() {
        return levelPrice;
    }

    public void setLevelPrice(BigDecimal levelPrice) {
        this.levelPrice = levelPrice;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", levelPrice=").append(levelPrice);
        sb.append(", spec=").append(spec);
        sb.append(", goodsImage=").append(goodsImage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}