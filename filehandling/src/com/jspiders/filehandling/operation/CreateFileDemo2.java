package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo2 {

	public static void main(String[] args) {
		File file = new File("E:\\Demo1.txt");
		
		try {
			file.createNewFile();
			System.out.println("file create hogayi bhai");
		} catch (IOException e) {
	
			e.printStackTrace();
			
		}
		
	}
}
