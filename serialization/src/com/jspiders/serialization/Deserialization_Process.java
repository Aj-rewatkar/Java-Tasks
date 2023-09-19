package com.jspiders.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization_Process  {
	
	public static void main(String[] args) throws Exception{
		
		File file = new File("E:\\demo.txt");
		
		if (file.exists()) {
			
			FileInputStream fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			
			Student student = (Student)objectInputStream.readObject();

			System.out.println(student);
			System.out.println("Object is fetched from the file");
			
			objectInputStream.close();
			fileInputStream.close();
			
			
			
			
			
		} else {
			System.out.println("File does not exist");
		}
				
	}

}
