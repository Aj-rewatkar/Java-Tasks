package com.jspiders.filehandling.operation;

import java.io.File;

public class FileInfo {
	
	public static void main(String[] args) {
		File file = new File("E:\\Demo1.txt");
		
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		
		if (file.canRead()) {
			System.out.println("File is Readable");
		} else {
			System.out.println("not readable");
		}
		
		if (file.canWrite()) {
			System.out.println("File is writable");
		} else {
			System.out.println("not writable");
		}
		
		if (file.canExecute()) {
			System.out.println("file is execuatble");

		} else {
			System.out.println("file is  not execuatble");

		}
		
	

		
		
	}

}
