package com.mbuy.entitys;

import java.util.ArrayList;
import java.util.List;

public class AliOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public AliOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAliWangwangIsNull() {
            addCriterion("ali_wangwang is null");
            return (Criteria) this;
        }

        public Criteria andAliWangwangIsNotNull() {
            addCriterion("ali_wangwang is not null");
            return (Criteria) this;
        }

        public Criteria andAliWangwangEqualTo(String value) {
            addCriterion("ali_wangwang =", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangNotEqualTo(String value) {
            addCriterion("ali_wangwang <>", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangGreaterThan(String value) {
            addCriterion("ali_wangwang >", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangGreaterThanOrEqualTo(String value) {
            addCriterion("ali_wangwang >=", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangLessThan(String value) {
            addCriterion("ali_wangwang <", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangLessThanOrEqualTo(String value) {
            addCriterion("ali_wangwang <=", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangLike(String value) {
            addCriterion("ali_wangwang like", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangNotLike(String value) {
            addCriterion("ali_wangwang not like", value, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangIn(List<String> values) {
            addCriterion("ali_wangwang in", values, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangNotIn(List<String> values) {
            addCriterion("ali_wangwang not in", values, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangBetween(String value1, String value2) {
            addCriterion("ali_wangwang between", value1, value2, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andAliWangwangNotBetween(String value1, String value2) {
            addCriterion("ali_wangwang not between", value1, value2, "aliWangwang");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Integer value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Integer value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Integer value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Integer value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Integer> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Integer> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andAliPhoneIsNull() {
            addCriterion("ali_phone is null");
            return (Criteria) this;
        }

        public Criteria andAliPhoneIsNotNull() {
            addCriterion("ali_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAliPhoneEqualTo(String value) {
            addCriterion("ali_phone =", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneNotEqualTo(String value) {
            addCriterion("ali_phone <>", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneGreaterThan(String value) {
            addCriterion("ali_phone >", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ali_phone >=", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneLessThan(String value) {
            addCriterion("ali_phone <", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneLessThanOrEqualTo(String value) {
            addCriterion("ali_phone <=", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneLike(String value) {
            addCriterion("ali_phone like", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneNotLike(String value) {
            addCriterion("ali_phone not like", value, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneIn(List<String> values) {
            addCriterion("ali_phone in", values, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneNotIn(List<String> values) {
            addCriterion("ali_phone not in", values, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneBetween(String value1, String value2) {
            addCriterion("ali_phone between", value1, value2, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliPhoneNotBetween(String value1, String value2) {
            addCriterion("ali_phone not between", value1, value2, "aliPhone");
            return (Criteria) this;
        }

        public Criteria andAliAddressIsNull() {
            addCriterion("ali_address is null");
            return (Criteria) this;
        }

        public Criteria andAliAddressIsNotNull() {
            addCriterion("ali_address is not null");
            return (Criteria) this;
        }

        public Criteria andAliAddressEqualTo(String value) {
            addCriterion("ali_address =", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressNotEqualTo(String value) {
            addCriterion("ali_address <>", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressGreaterThan(String value) {
            addCriterion("ali_address >", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ali_address >=", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressLessThan(String value) {
            addCriterion("ali_address <", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressLessThanOrEqualTo(String value) {
            addCriterion("ali_address <=", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressLike(String value) {
            addCriterion("ali_address like", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressNotLike(String value) {
            addCriterion("ali_address not like", value, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressIn(List<String> values) {
            addCriterion("ali_address in", values, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressNotIn(List<String> values) {
            addCriterion("ali_address not in", values, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressBetween(String value1, String value2) {
            addCriterion("ali_address between", value1, value2, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliAddressNotBetween(String value1, String value2) {
            addCriterion("ali_address not between", value1, value2, "aliAddress");
            return (Criteria) this;
        }

        public Criteria andAliRemarkIsNull() {
            addCriterion("ali_remark is null");
            return (Criteria) this;
        }

        public Criteria andAliRemarkIsNotNull() {
            addCriterion("ali_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAliRemarkEqualTo(String value) {
            addCriterion("ali_remark =", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkNotEqualTo(String value) {
            addCriterion("ali_remark <>", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkGreaterThan(String value) {
            addCriterion("ali_remark >", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ali_remark >=", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkLessThan(String value) {
            addCriterion("ali_remark <", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkLessThanOrEqualTo(String value) {
            addCriterion("ali_remark <=", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkLike(String value) {
            addCriterion("ali_remark like", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkNotLike(String value) {
            addCriterion("ali_remark not like", value, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkIn(List<String> values) {
            addCriterion("ali_remark in", values, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkNotIn(List<String> values) {
            addCriterion("ali_remark not in", values, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkBetween(String value1, String value2) {
            addCriterion("ali_remark between", value1, value2, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliRemarkNotBetween(String value1, String value2) {
            addCriterion("ali_remark not between", value1, value2, "aliRemark");
            return (Criteria) this;
        }

        public Criteria andAliProductIsNull() {
            addCriterion("ali_product is null");
            return (Criteria) this;
        }

        public Criteria andAliProductIsNotNull() {
            addCriterion("ali_product is not null");
            return (Criteria) this;
        }

        public Criteria andAliProductEqualTo(String value) {
            addCriterion("ali_product =", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductNotEqualTo(String value) {
            addCriterion("ali_product <>", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductGreaterThan(String value) {
            addCriterion("ali_product >", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductGreaterThanOrEqualTo(String value) {
            addCriterion("ali_product >=", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductLessThan(String value) {
            addCriterion("ali_product <", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductLessThanOrEqualTo(String value) {
            addCriterion("ali_product <=", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductLike(String value) {
            addCriterion("ali_product like", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductNotLike(String value) {
            addCriterion("ali_product not like", value, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductIn(List<String> values) {
            addCriterion("ali_product in", values, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductNotIn(List<String> values) {
            addCriterion("ali_product not in", values, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductBetween(String value1, String value2) {
            addCriterion("ali_product between", value1, value2, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliProductNotBetween(String value1, String value2) {
            addCriterion("ali_product not between", value1, value2, "aliProduct");
            return (Criteria) this;
        }

        public Criteria andAliMoneyIsNull() {
            addCriterion("ali_money is null");
            return (Criteria) this;
        }

        public Criteria andAliMoneyIsNotNull() {
            addCriterion("ali_money is not null");
            return (Criteria) this;
        }

        public Criteria andAliMoneyEqualTo(Long value) {
            addCriterion("ali_money =", value, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyNotEqualTo(Long value) {
            addCriterion("ali_money <>", value, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyGreaterThan(Long value) {
            addCriterion("ali_money >", value, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("ali_money >=", value, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyLessThan(Long value) {
            addCriterion("ali_money <", value, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyLessThanOrEqualTo(Long value) {
            addCriterion("ali_money <=", value, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyIn(List<Long> values) {
            addCriterion("ali_money in", values, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyNotIn(List<Long> values) {
            addCriterion("ali_money not in", values, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyBetween(Long value1, Long value2) {
            addCriterion("ali_money between", value1, value2, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliMoneyNotBetween(Long value1, Long value2) {
            addCriterion("ali_money not between", value1, value2, "aliMoney");
            return (Criteria) this;
        }

        public Criteria andAliImgsIsNull() {
            addCriterion("ali_imgs is null");
            return (Criteria) this;
        }

        public Criteria andAliImgsIsNotNull() {
            addCriterion("ali_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andAliImgsEqualTo(String value) {
            addCriterion("ali_imgs =", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsNotEqualTo(String value) {
            addCriterion("ali_imgs <>", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsGreaterThan(String value) {
            addCriterion("ali_imgs >", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsGreaterThanOrEqualTo(String value) {
            addCriterion("ali_imgs >=", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsLessThan(String value) {
            addCriterion("ali_imgs <", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsLessThanOrEqualTo(String value) {
            addCriterion("ali_imgs <=", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsLike(String value) {
            addCriterion("ali_imgs like", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsNotLike(String value) {
            addCriterion("ali_imgs not like", value, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsIn(List<String> values) {
            addCriterion("ali_imgs in", values, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsNotIn(List<String> values) {
            addCriterion("ali_imgs not in", values, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsBetween(String value1, String value2) {
            addCriterion("ali_imgs between", value1, value2, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andAliImgsNotBetween(String value1, String value2) {
            addCriterion("ali_imgs not between", value1, value2, "aliImgs");
            return (Criteria) this;
        }

        public Criteria andDesignIsNull() {
            addCriterion("design is null");
            return (Criteria) this;
        }

        public Criteria andDesignIsNotNull() {
            addCriterion("design is not null");
            return (Criteria) this;
        }

        public Criteria andDesignEqualTo(String value) {
            addCriterion("design =", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotEqualTo(String value) {
            addCriterion("design <>", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThan(String value) {
            addCriterion("design >", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThanOrEqualTo(String value) {
            addCriterion("design >=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThan(String value) {
            addCriterion("design <", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThanOrEqualTo(String value) {
            addCriterion("design <=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLike(String value) {
            addCriterion("design like", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotLike(String value) {
            addCriterion("design not like", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignIn(List<String> values) {
            addCriterion("design in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotIn(List<String> values) {
            addCriterion("design not in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignBetween(String value1, String value2) {
            addCriterion("design between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotBetween(String value1, String value2) {
            addCriterion("design not between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andPackIsNull() {
            addCriterion("pack is null");
            return (Criteria) this;
        }

        public Criteria andPackIsNotNull() {
            addCriterion("pack is not null");
            return (Criteria) this;
        }

        public Criteria andPackEqualTo(String value) {
            addCriterion("pack =", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotEqualTo(String value) {
            addCriterion("pack <>", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThan(String value) {
            addCriterion("pack >", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackGreaterThanOrEqualTo(String value) {
            addCriterion("pack >=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThan(String value) {
            addCriterion("pack <", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLessThanOrEqualTo(String value) {
            addCriterion("pack <=", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackLike(String value) {
            addCriterion("pack like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotLike(String value) {
            addCriterion("pack not like", value, "pack");
            return (Criteria) this;
        }

        public Criteria andPackIn(List<String> values) {
            addCriterion("pack in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotIn(List<String> values) {
            addCriterion("pack not in", values, "pack");
            return (Criteria) this;
        }

        public Criteria andPackBetween(String value1, String value2) {
            addCriterion("pack between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andPackNotBetween(String value1, String value2) {
            addCriterion("pack not between", value1, value2, "pack");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Integer value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Integer value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Integer value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Integer value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Integer value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Integer> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Integer> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Integer value1, Integer value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}