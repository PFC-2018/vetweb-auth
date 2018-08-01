package com.vetweb.auth.configuration;

import java.security.MessageDigest;

import javax.xml.bind.DatatypeConverter;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		System.out.println(PasswordGenerator.genPassword("vetweb"));
	}
	
	public static String genPassword(String password) {
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(password.getBytes());
			return DatatypeConverter.printHexBinary(messageDigest.digest()).toLowerCase();
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

}
