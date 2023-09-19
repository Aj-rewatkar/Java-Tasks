package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	
	public static void main(String[] args) {
		File file = new File("E:\\Aj.txt");

		
		if (file.exists()) {
			System.out.println("File is already exist");
			System.out.println("Do you want to delete the existing file? \n 1: Yes \n 2: No");
			
			try (Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				
				switch (n) {
				case 1: 
					file.delete();
					System.out.println(file+" File is deleted");
					break;

				case 2:
					System.out.println("file is present");
					break;
				default:
					System.out.println("Invalid Coice");
					break;
				}
			}
			
			
		} else {
			try {
				file.createNewFile();
				System.out.println(file+" file is created");

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("file is not created");

			}
		}
		
		
	}
}
