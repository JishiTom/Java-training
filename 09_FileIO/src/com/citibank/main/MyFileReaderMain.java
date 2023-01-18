package com.citibank.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

import com.citibank.main.domain.MyFileReader;

public class MyFileReaderMain {

	public static void main(String[] args) {
		String path ="";
	
		
		Scanner scanner = new Scanner(System.in)	;
		System.out.println("enter path");
		path  = scanner.nextLine();
		
		File file = new File(path);
		FileReader fileReader = null;
		MyFileReader myFileReader = null;
		BufferedReader bufferedReader = null;
		
		
	try {	
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		myFileReader = new MyFileReader(bufferedReader);
		
		String data = myFileReader.readFileLineByLine();
		System.out.println(data);
	}
	catch(FileNotFoundException e) {
		System.out.println("error while opening file");
	} finally{
		try {
			fileReader.close();
			bufferedReader.close();
		}catch(IOException e) {
			System.out.println("error while closing buffered reader");
		}
	}
		
		
		
//		String text;
//		String path ="";
//		Scanner scanner = new Scanner(System.in);
//		Reader reader = null;
//		File file = new File(path);
//		MyFileReader myfilereader =null;
//		FileReader filereader =null;
		
		
		
//		System.out.println("enter path");
//		path  = scanner.nextLine();
		
//		try {
//			filereader = new FileReader(file);
//			myfilereader = new MyFileReader(file, filereader);
//			String data = myfilereader.readfile();
//			Myfilereader.readfile();
//			if (data.equals("")) {
//				System.out.println("failed to read the file");
//			}
//			else {
//				System.out.println("data");
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			try {
//				System.out.println("error in close1");
//				filereader.close();
//				
//			}
//			catch(IOException e) {
//				System.out.println("error in close2");
//			}
		}
		

}
