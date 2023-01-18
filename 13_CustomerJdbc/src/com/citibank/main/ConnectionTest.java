package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection connection = null;;
		// TODO Auto-generated method stub
		System.out.println("main start");
		Scanner scanner;
		String name ;
		String address;
		int rowCount = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. Driver loaded successfully");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citibankdb", "root", "root");
			System.out.println("Connection Successfull");
			String sql ="insert into customer_details(name, address) values(?, ?)" ;
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			for (int i =0; i<5; i++) {
				
			scanner = new Scanner(System.in);
			System.out.println("please enter the name ");
			name = scanner.next();
			System.out.println("please enter the address");
			address = scanner.next();
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, address);
			preparedStatement.executeUpdate();	
			rowCount = rowCount +1;
			}

			if(rowCount > 0) {
				System.out.println("record inserted successfully " + rowCount);
			} else {
				System.out.println(" Insertion failed");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("driver not found");
		}finally { 
			try {
			connection.close();
			} catch (SQLException e)
			{
			e.printStackTrace()	;
			}
		System.out.println("main end");
	}
	}

}
