package com.jspiders.filehandling.characterstream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\Aj1.txt");
		
		if (file.exists()) {
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("Data is written by programmer");
			System.out.println("Data added Successfully");
			fileWriter.close();
			
			
		} else {
			file.createNewFile();
			System.out.println("File is created");
			
			FileWriter fWriter = new FileWriter(file);
			fWriter.write("hi Boss");
			System.out.println("data added ");
			fWriter.close();

		}
		
	}

}
