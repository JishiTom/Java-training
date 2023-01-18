package com.citibank.main;

import java.io.Writer;
import java.util.Scanner;

import com.citibank.main.domain.MyFileWriter;

public class MyFileWriterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileWriter myFileWriter;
		Scanner scanner = new Scanner(System.in);
		String path ="";
		String text1;
		String text2;
		
		
		System.out.println("enter the text to be sent into the file");
		System.out.println("enter path");
		path  = scanner.nextLine();
		
		System.out.println("enter test to be inserted");
		text1  = scanner.nextLine();
		scanner.nextLine();
		text2  = scanner.nextLine();
		scanner.nextLine();
		
//		Writer write = new Writer(path);
		
		myFileWriter = new MyFileWriter(null, text2);
		
	}

}
