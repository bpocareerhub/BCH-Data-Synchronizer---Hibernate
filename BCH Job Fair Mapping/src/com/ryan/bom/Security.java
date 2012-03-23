package com.ryan.bom;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Security {

	public static String md5(String str) {
		String hex = null;
		byte[] defaultBytes = str.getBytes();
		
		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(defaultBytes);
			byte messageDigest[] = algorithm.digest();
			
			StringBuffer hexString = new StringBuffer();
			
			for(int i = 0; i < messageDigest.length; i++) {
				hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
			}
			hex = hexString + "";
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		return hex;
	}
}
