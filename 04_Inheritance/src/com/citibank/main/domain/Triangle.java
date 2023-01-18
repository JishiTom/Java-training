package com.citibank.main.domain;

public class Triangle extends Shapes {
	
	public Triangle() {
		System.out.println(" default constructor Triangle");
	}
@Override
public void draw() {
	System.out.println(" drawing triangle");
}
public void print() {
	System.out.println("Drawing Line");
}
}
