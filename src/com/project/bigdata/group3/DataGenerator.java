package com.project.bigdata.group3;

import java.io.IOException;

public class DataGenerator {
	
	private final static String filePath = "/Users/skethireddy2/Documents/ITU/Big-Data/Project/InputData/";
	private final static String fileName = "inputdata.txt";
	public static void main(String[] args) {
		try {
			FileUtil.populateFile(filePath,fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
