package com.vetweb.auth.configuration;

import java.security.MessageDigest;

import org.jboss.security.Base64Encoder;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		System.out.println(new PasswordGenerator().genPassword("vetweb"));
	}
	
	public String genPassword(String password) {
		try {
			byte[] digest = MessageDigest.getInstance("sha-256").digest(password.getBytes());
			return Base64Encoder.encode(digest);
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
	}

}
