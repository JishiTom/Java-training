package com.citibank.main.domain;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class WriteMyFile {

	private File file;
	private OutputStream OutputStream;
	private String outMessage;
	
	public WriteMyFile( OutputStream OutputStream, String outMessage) {
		this.OutputStream = OutputStream;
		this.outMessage = outMessage;
	}
	
	public boolean writefile() {
		
		byte[] data = outMessage.getBytes();
		try {
			OutputStream.write(data);
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("error while writing");
			e.printStackTrace();
			return false;
		}
		
		finally {
			try {
				OutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error while closing the stream");
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
