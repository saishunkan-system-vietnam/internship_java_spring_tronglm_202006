package com.managedevice.restfullApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.managedevice.restfullApi.mapper.UserAccountMapper;
import com.managedevice.restfullApi.model.UserAccount;

@Service
public class UserAccountServiveImpl implements UserAccountService {

	@Autowired
	UserAccountMapper userAccountMapper;

	@Override
	public List<UserAccount> getAll() {
		// TODO Auto-generated method stub
		return userAccountMapper.getAll();
	}

	@Override
	public UserAccount getById(int id) {
		// TODO Auto-generated method stub
		return userAccountMapper.getById(id);
	}

	@Override
	public void insert(UserAccount userAccount) {	
		userAccountMapper.insert(userAccount);
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserAccount userAccount) {
		userAccountMapper.update(userAccount);
		// TODO Auto-generated method stub

	}

}
