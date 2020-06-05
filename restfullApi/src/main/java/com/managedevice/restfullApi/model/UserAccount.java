package com.managedevice.restfullApi.model;

import java.time.LocalDateTime;

public class UserAccount {
	private int id;
	private String nameUser;
	private String passWord;
	private String mail;
	private String phoneNumber;
	private String address;
	private int delFlg;
	private int roleFlg;
	private LocalDateTime creatDatetime = LocalDateTime.now();
	private LocalDateTime updateDatetime;
	
	
	public UserAccount() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameUser() {
		return nameUser;
	}
	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(int delFlg) {
		this.delFlg = delFlg;
	}
	public int getRoleFlg() {
		return roleFlg;
	}
	public void setRoleFlg(int roleFlg) {
		this.roleFlg = roleFlg;
	}
	public LocalDateTime getCreatDate() {
		return creatDatetime;
	}

	public LocalDateTime getCreatDatetime() {
		return creatDatetime;
	}

	public void setCreatDatetime(LocalDateTime creatDatetime) {
		this.creatDatetime = creatDatetime;
	}

	public LocalDateTime getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(LocalDateTime updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	
}
