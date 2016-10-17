package com.project.bigdata.group3;

import java.util.UUID;

public class RandomDataGenerator {
	
	
	public static String generateRandomString()
	{
		StringBuffer sbuffer = new StringBuffer();
		String uniqueId = UUID.randomUUID().toString();
		sbuffer.append(uniqueId.replaceAll("[-+.^:,]",""));
		return sbuffer.toString();
	}
	public static void main(String[] args) {
		System.out.println(generateRandomString());
	}
	

}
