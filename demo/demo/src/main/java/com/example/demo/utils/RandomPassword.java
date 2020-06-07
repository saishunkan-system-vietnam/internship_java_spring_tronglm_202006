package com.example.demo.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomPassword {
	public static String randomPasswordAccount() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String pwd = RandomStringUtils.random(15, characters);
		return pwd;
	}

}
