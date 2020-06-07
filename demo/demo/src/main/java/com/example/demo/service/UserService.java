package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.mapping.MappingUserAccount;
import com.example.demo.model.UserAccount;
import com.example.demo.utils.RandomPassword;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private MappingUserAccount mappingUserAccount;
	
	public void createUser(UserAccount account) {
		account.setCreatDate(LocalDate.now());
		mappingUserAccount.insert(account);
	}
	
	public List<UserAccount> getAll(UserAccount account) {
		return mappingUserAccount.getAll(account);
	}
	
	public int getTotal(UserAccount account) { 
		return mappingUserAccount.getTotalUser(account).intValue();
	}
	
	public UserAccount resetPassword(String email) {
		// chưa có modifyBy
		UserAccount account = mappingUserAccount.getByEmail(email);
		String pwNew = RandomPassword.randomPasswordAccount();
		account.setPassWord(pwNew);
		account.setUpDateDate(LocalDate.now());
		// send mail
		mappingUserAccount.update(account);
		return account;		
	}
}
