package com.jspiders.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationProcess {
	
	public static void main(String[] args) throws Exception {
		
		File file = new File("E:\\Demo.txt");
		
		if (file.exists()) {
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
						
			Student student = new Student(30,"Ajay",24);
			
			objectOutputStream.writeObject(student);
			System.out.println("Object is written to the file");	
			
			objectOutputStream.close();
			fileOutputStream.close();
			
			
		} else {
			
			file.createNewFile();
			System.out.println("file is created");
			
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(new Student(5,"Vijay",22));
			
			System.out.println("object is written to the file ");
			
			objectOutputStream.close();
			fileOutputStream.close();
			
			
		}
		
		
		
	}

}
