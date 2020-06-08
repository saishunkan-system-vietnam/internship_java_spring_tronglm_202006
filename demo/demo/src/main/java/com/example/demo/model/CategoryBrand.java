package com.example.demo.model;

public class CategoryBrand extends AbstractModel<CategoryBrand> {
	
	private static final long serialVersionUID = 1L;
	
	private int idParent;
	private String brandName;
	private int delFlg;
	
	public int getIdParent() {
		return idParent;
	}
	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}
	
}
