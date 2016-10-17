package com.project.bigdata.group3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	static File file = null;
	static BufferedWriter bufferWriter = null;

	public static File createFile(String fileName) throws IOException
	{
		if(file==null)
		{
			file = new File("/Users/user/Documents/ITU/Big-Data/Project/InputData/"+fileName);
			return file;
		}
		else
			return file;
	}

	public static void populateFile() throws IOException
	{
		createFile("inputdata.txt");
		bufferWriter = new BufferedWriter(new FileWriter(file));
		double bytes = 0.0;
		double kiloBytes = 0.0;
		double megaBytes = 0.0;
		double gigaBytes = 0.0;
		do
		{
			bytes = file.length()/1024;
			kiloBytes = bytes/1024;
			megaBytes = kiloBytes/1024;
			gigaBytes = megaBytes/1024;	
			bufferWriter.write(RandomDataGenerator.generateRandomString()+" "+RandomDataGenerator.generateRandomString());
			bufferWriter.newLine();
		}while(gigaBytes<=10);


	}
}
