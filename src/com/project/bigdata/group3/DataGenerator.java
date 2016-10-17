package com.project.bigdata.group3;

import java.io.IOException;

public class DataGenerator {
	
	public static void main(String[] args) {
		try {
			FileUtil.populateFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
