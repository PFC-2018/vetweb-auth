package com.vetweb.auth.configuration;

import java.util.Base64;

//import java.security.MessageDigest;

//import org.jboss.security.Base64Encoder;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		System.out.println(PasswordGenerator.genPassword("vetweb"));
	}
	
	public static String genPassword(String password) {
		try {
//			byte[] digest = MessageDigest.getInstance("sha-256").digest(password.getBytes());
			return new String(Base64.getEncoder().encode(password.getBytes()));
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

}
