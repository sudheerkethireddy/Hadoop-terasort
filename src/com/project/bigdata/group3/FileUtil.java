package com.project.bigdata.group3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtil {

	static File file = null;
	static BufferedWriter bufferWriter = null;

	public static File createFile(String filePath,String fileName) throws IOException
	{
		if(file==null)
		{
			Path path = Paths.get(filePath+fileName);
			Files.createDirectories(path.getParent());
			file = Files.createFile(path).toFile();
			return file;
		}
		else
			return file;
	}

	public static void populateFile(String filepath, String filename) throws IOException
	{
		createFile(filepath,filename);
		bufferWriter = new BufferedWriter(new FileWriter(file));
		
		double kiloBytes = 0.0;
		double megaBytes = 0.0;
		double gigaBytes = 0.0;
		while(gigaBytes<=10)
		{	 
			kiloBytes = file.length()/1024;
			megaBytes = kiloBytes/1024;
			gigaBytes = megaBytes/1024;	
			bufferWriter.write(returnNLinesGeneratedString(1000));
			bufferWriter.newLine();
		}


	}

	/**
	 * This util method helps us write n lines at a time to file
	 * as File I/O is bottlenock for any application
	 * @param n: the number of lines of string you want to add
	 * @return string: the string generated
	 */
	private static String returnNLinesGeneratedString(int n)
	{
		int i = 1;
		StringBuffer s = new StringBuffer(32);
		while(i<=n)
		{
			s.append(RandomDataGenerator.generateRandomString());
			s.append(" ");
			s.append(RandomDataGenerator.generateRandomString());
			s.append(System.lineSeparator());
			i++;
		}
		return s.toString();
	}

}
