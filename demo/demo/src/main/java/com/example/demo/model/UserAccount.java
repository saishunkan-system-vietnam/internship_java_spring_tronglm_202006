package com.example.demo.model;

import lombok.Data;

@Data
public class UserAccount extends AbstractModel<UserAccount> {
	private static final long serialVersionUID = 1L;
	
	private String nameAccount;
	private String passWord;
	private String mail;
	private String phoneNumber;
	private Integer delFlg;
	private Integer roleFlg;
	
	public String getNameAccount() {
		return nameAccount;
	}
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
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
	public Integer getDelFlg() {
		return delFlg;
	}
	public void setDelFlg(Integer delFlg) {
		this.delFlg = delFlg;
	}
	public Integer getRoleFlg() {
		return roleFlg;
	}
	public void setRoleFlg(Integer roleFlg) {
		this.roleFlg = roleFlg;
	}
	
}
