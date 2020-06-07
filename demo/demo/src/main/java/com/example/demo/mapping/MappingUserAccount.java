package com.example.demo.mapping;

import java.math.BigInteger;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.UserAccount;

@Repository
public interface MappingUserAccount {

	// get all userAccount
	public List<UserAccount> getAll(UserAccount account);

	// total all user
	public BigInteger getTotalUser(UserAccount account);

	// get student by id
	public UserAccount getById(int id);

	// insert user
	public void insert(UserAccount userAccount);

	// get account by email
	public UserAccount getByEmail(String email);

	// update account
	public void update(UserAccount userAccount);

}
