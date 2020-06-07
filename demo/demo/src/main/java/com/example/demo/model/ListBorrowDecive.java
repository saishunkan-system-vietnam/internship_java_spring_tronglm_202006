package com.example.demo.model;

import java.time.LocalDate;

public class ListBorrowDecive extends AbstractModel<ListBorrowDecive> {
	private static final long serialVersionUID = 1L;
	
	private int idUser;
	private int idDecive;
	private LocalDate datePurcharse;
	private int delFlg;
	private int statusFlg;
	private LocalDate returnDate;


	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdDecive() {
		return idDecive;
	}
	public void setIdDecive(int idDecive) {
		this.idDecive = idDecive;
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
	public int getStatusFlg() {
		return statusFlg;
	}
	public void setStatusFlg(int statusFlg) {
		this.statusFlg = statusFlg;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
	
}
