package com.jspiders.filehandling.characterstream;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Reader {
	
	public static void main(String[] args) throws Exception {
		File file = new File("E:\\Aj.txt");
		
		if (file.exists()) {
			FileReader fileReader = new FileReader(file);
			fileReader.read();
			
			System.out.println("data is fetched by user");
			fileReader.close();
			
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("Data is fetched from the file using scanner ");
			sc.close();
			
		} else {
			System.out.println("File is not exist");

		}
	}

}
