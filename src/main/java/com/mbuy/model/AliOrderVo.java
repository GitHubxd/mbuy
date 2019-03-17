/**
 * 
 */
package com.mbuy.model;

import java.util.List;

import com.mbuy.entitys.AliOrder;

/**
 * @author 37523
 *
 */
public class AliOrderVo extends AliOrder{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Integer> ids;
	
	private Integer startRow;
	
	private Integer rowCount;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	
}
