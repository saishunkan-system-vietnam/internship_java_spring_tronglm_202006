package com.example.demo.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class AbstractModel<T> implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private LocalDate creatDate;
	private LocalDate upDateDate;
	private int page = 1;
	private int maxPageItem = 10;
	private int totalItem;
	private int offset;

	private List<T> results;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getMaxPageItem() {
		return maxPageItem;
	}

	public void setMaxPageItem(int maxPageItem) {
		this.maxPageItem = maxPageItem;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(LocalDate creatDate) {
		this.creatDate = creatDate;
	}

	public LocalDate getUpDateDate() {
		return upDateDate;
	}

	public void setUpDateDate(LocalDate upDateDate) {
		this.upDateDate = upDateDate;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}

}
