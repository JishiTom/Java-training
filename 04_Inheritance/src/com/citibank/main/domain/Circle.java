package com.citibank.main.domain;

public class Circle extends Shapes {
		// even when super is not written , compiler adds the super ( superclass
	// or parent )
	// super has to be the very first statement
	public Circle() {
		System.out.println("default constructor of circle");
	}
	public Circle(int size) {
		super(size);
		System.out.println(" parameterized constructor of circle" + size);
		
	}
//@Override
public void draw() {
	System.out.println(" drawing circle");
}
@Override
public void print() {

System.out.println("print of circle");
}
}
