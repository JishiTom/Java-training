package com.citibank.main.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class MyFileMetadata {
	
	//value of path is currently empty
//	private String path ="";
	// cdrive: new folder:
private String path ="C:\\javatraining/TestData.txt";
private InputStream inputstream;
///either u can pre assign the array value with below statement
//private byte[] data = new byte[100];
//to get the array length dynamically
private int arraylength;
private byte[] data;


public void printFileMetadata() {
	File file = new File(path);
	
	
	if(file.exists()) {
		System.out.println(" data in the text file");
		System.out.println("file name: " + file.getName());
		System.out.println("File Path " + file.getPath());
		System.out.println("File length " + file.length());
		System.out.println("can read " + file.canRead());
		System.out.println("can write " + file.canWrite());
		System.out.println("can open " + file.canExecute());
		Date lastModifiedDate = new Date(file.lastModified());
		System.out.println("last Modified " + lastModifiedDate);
//		System.out.println(" contecnt in file" + file.);
	}
	else {
		System.out.println(" kindly place the file and check");
	
	}
	// READ MY FILE
	// TRY Catch exception  is a mandate
	try {
//		 	File file1 = new File(path);
		 	arraylength = (int) file.length();
		 	data = new byte[arraylength];
		 	
			inputstream = new FileInputStream(path);
		
			inputstream.read(data);
			for(byte b :data) {
			System.out.print((char)b);
			}
	} catch (FileNotFoundException e) {
		System.out.println("file not found");
		
	} catch (IOException e) {	
		System.out.println(" error in reading file");
		
	}finally {
		try {
			inputstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}

private String toString(byte[] data2) {
	// TODO Auto-generated method stub
	return null;
}
}
