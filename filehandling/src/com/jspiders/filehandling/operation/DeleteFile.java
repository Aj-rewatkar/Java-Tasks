package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) {
		
		File file = new File("E:\\Demo.txt");
		
		if (file.exists()) {
			System.out.println("file is already present");
			file.delete();
			System.out.println("File is deleted ");
			
		} else {
			
			try {
				file.createNewFile();
				System.out.println("new File is created");
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	
		
	}
}
