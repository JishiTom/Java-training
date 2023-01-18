package com.citibank.main.domain;

import java.io.IOException;
import java.io.Writer;

public class MyFileWriter {
private Writer fileWriter;
private String data;



public MyFileWriter(Writer fileWriter, String data) {
	super();
	this.fileWriter = fileWriter;
	this.data = data;
}
public boolean writeFile() {
	try {
		fileWriter.write(data);
		return true;
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error while writing");
		e.printStackTrace();
		return false;
	}finally {
		try {
			fileWriter.close();
			System.out.println("error while closing file");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}

}
