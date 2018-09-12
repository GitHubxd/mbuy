package com.mbuy.utils;

/**
 * 公共response返回结果
 * 
 * @author 37523
 *
 */
public class CommonResponse {

	private Integer errorCode;

	private Integer totalNum;

	private Integer startNum;

	private Integer countNum;

	private Object result;

	public CommonResponse(Integer errorCode, Integer totalNum, Integer startNum, Integer countNum, Object result) {
		super();
		this.errorCode = errorCode;
		this.totalNum = totalNum;
		this.startNum = startNum;
		this.countNum = countNum;
		this.result = result;
	}

	public static CommonResponse getInstance() {
		return new CommonResponse(ErrorCode.CODE_10000, null, null, null, null);
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public Integer getStartNum() {
		return startNum;
	}

	public void setStartNum(Integer startNum) {
		this.startNum = startNum;
	}

	public Integer getCountNum() {
		return countNum;
	}

	public void setCountNum(Integer countNum) {
		this.countNum = countNum;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

}
