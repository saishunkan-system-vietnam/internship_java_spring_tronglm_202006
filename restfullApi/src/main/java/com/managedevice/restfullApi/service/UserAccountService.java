package com.managedevice.restfullApi.service;

import java.util.List;

import com.managedevice.restfullApi.model.UserAccount;

public interface UserAccountService {

	public List<UserAccount> getAll();

	public UserAccount getById(int id);

	public void  insert(UserAccount userAccount);
	
    public void update(UserAccount userAccount);
}
