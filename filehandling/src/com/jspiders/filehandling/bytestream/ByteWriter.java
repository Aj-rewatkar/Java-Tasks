package com.jspiders.filehandling.bytestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteWriter {

	public static void main(String[] args) throws IOException {
	
		File file = new File("E:\\Aj2.txt");
		
		if (file.exists()) {
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			
			fileOutputStream.write(20);
			System.out.println("byte data added");
			fileOutputStream.close();
		} else {
			
			file.createNewFile();
			System.out.println("new File is created");
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			fileOutputStream.write(10);
			
			System.out.println("Data added");
			fileOutputStream.close();

		}
		
		
	}
}
