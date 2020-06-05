package com.managedevice.restfullApi.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.managedevice.restfullApi.model.Response;
import com.managedevice.restfullApi.model.UserAccount;
import com.managedevice.restfullApi.service.UserAccountService;

@RestController
@RequestMapping("/api/userAccount")
public class UserAccountController {

	private Response response;

	@Autowired
	UserAccountService UserAccountService;

	@RequestMapping(value = "/getList", method = GET)
	public Response getAll() {
		
		Integer code;
		String message;
		List<UserAccount> payload = UserAccountService.getAll();
		
		if(payload != null) {
			 code = 200;
			 message = "Success";
		} else {
			code = 290;
			message = "Data not found";
		}		
		return response = new Response(code, message, payload);
	}

	@RequestMapping(value = "/get", params = "id", method = GET)
	public Response getById(@RequestParam int id) {
		Integer code;
		String message;
		Object payload = UserAccountService.getById(id);
		
		if(payload != null) {
			 code = 200;
			 message = "Success";
		} else {
			code = 290;
			message = "Data not found";
		}
		return response = new Response(code, message, payload);
}		
		

	@RequestMapping(value = "/addUser", method = POST)
	public Response addUser(@RequestBody UserAccount userAccount) {
		Integer code;
		String message;
		try {
			UserAccountService.insert(userAccount);
			code = 200;
			message = "Save Success";
		} catch(Exception e) {
			e.printStackTrace();
			code = 201;
			message = "errors";
		}
		return response = new Response(code, message);
//	        if(UserAccountService.insert(userAccount)) {
//	            System.out.println("Created New User!");
//	            return new ResponseEntity<Void>(OK);
//	        } else {
//	            System.out.println("Can not create new user!");
//	            return new ResponseEntity<Void>(BAD_REQUEST);
//	        }
	}

//	public void update(UserAccount userAccount) {
//		userAccountMapper.update(userAccount);
//	}
	
	@RequestMapping(value = "/upDate", method = POST)
	public Response upDate(@RequestBody UserAccount userAccount) {
		Integer code;
		String message;
		try {
			UserAccountService.update(userAccount);
			code = 200;
			message = "UpDate Success";
		} catch(Exception e) {
			code = 201;
			message = "errors";
		}
		return response = new Response(code, message);
	}
}