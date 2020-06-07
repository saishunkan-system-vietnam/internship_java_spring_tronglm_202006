package com.example.demo.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mapping.MappingUserAccount;
import com.example.demo.model.UserAccount;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/account")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private MappingUserAccount account;

	@GetMapping("/getall")
	public ResponseEntity<UserAccount> getAll() {
		UserAccount userAccount = new UserAccount();
		userAccount.setOffset((userAccount.getPage() - 1) * userAccount.getMaxPageItem());
		userAccount.setResults(userService.getAll(userAccount));
		userAccount.setTotalItem(userService.getTotal(userAccount));
		return ResponseEntity.ok().body(userAccount);
	}

	@PostMapping("/create-user")
	public ResponseEntity<UserAccount> createUser(@RequestBody UserAccount userAccount) {
		userService.createUser(userAccount);
		return ResponseEntity.ok().body(userAccount);
	}

	@PutMapping("/modify-pass")
	public ResponseEntity<UserAccount> modifyPassWord(@RequestBody String email) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.resetPassword(email));
	}
}
