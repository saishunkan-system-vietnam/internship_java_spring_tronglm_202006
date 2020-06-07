package com.example.demo.model;

import java.time.LocalDate;

public class DeciveList extends AbstractModel<DeciveList> {
	
	private static final long serialVersionUID = 1266920220251342137L;
	
	private String nameDecive;
	private int idBrand;
	private LocalDate datePurcharse;
	private int delFlg;
	private int totalDecive;
	private int totalExis;

	public String getNameDecive() {
		return nameDecive;
	}
	public void setNameDecive(String nameDecive) {
		this.nameDecive = nameDecive;
	}
	public int getIdBrand() {
		return idBrand;
	}
	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}
	public LocalDate getDatePurcharse() {
		return datePurcharse;
	}
	public void setDatePurcharse(LocalDate datePurcharse) {
		this.datePurcharse = datePurcharse;
	}
	public int getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}
	public int getTotalDecive() {
		return totalDecive;
	}
	public void setTotalDecive(int totalDecive) {
		this.totalDecive = totalDecive;
	}
	public int getTotalExis() {
		return totalExis;
	}
	public void setTotalExis(int totalExis) {
		this.totalExis = totalExis;
	}
	
}
