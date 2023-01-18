package com.citibank.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.citibank.main.domain.MyFileMetadata;
import com.citibank.main.domain.WriteMyFile;

public class MyfileMetadataMain {

	public static void main(String[] args) {
//		String path ="C:\\javatraining/TestData.txt";
		String path ="";
		File file = new File(path);
//		inputstream = new FileInputStream(path);
		OutputStream outputstream1 = null;
		WriteMyFile writefile =null;
		Scanner scanner = new Scanner(System.in);
		String text;
		System.out.println("enter path");
		path  = scanner.nextLine();
		
		System.out.println("enter test to be inserted");
		text  = scanner.nextLine();
		scanner.nextLine();
		try {
			outputstream1 = new FileOutputStream(path);
			writefile = new WriteMyFile(outputstream1, text);
			writefile.writefile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				outputstream1.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		
		MyFileMetadata myfile = new MyFileMetadata();
		myfile.printFileMetadata();
		
	
	}

}
