package com.jspiders.filehandling.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ByteReader {
	
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Aj4.txt");
		
		if (file.exists()) {
			
			System.out.println("File is present");
			FileInputStream fileInputStream = new FileInputStream(file);
			
			fileInputStream.read();
			System.out.println("Data is fetch from file");
			fileInputStream.close();
			
			
			
		} else {
			
			
			System.out.println("file is not present");
			file.createNewFile();
			
			System.out.println("File is created");
			FileInputStream fileInputStream = new FileInputStream(file);
			
			fileInputStream.read();
			System.out.println("Data is fetch from file");
			fileInputStream.close();
		}
		
	}

}
