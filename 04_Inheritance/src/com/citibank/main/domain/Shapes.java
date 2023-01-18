package com.citibank.main.domain;
// generalized calls /parent class
public abstract class Shapes {
	public Shapes() {
		System.out.println(" default constructor of shapes");
	}
	public Shapes(int size) {
		System.out.println("Param Constructor of shapes"  + size);
	}
	public abstract void draw();
	
	//public void print() {
	//	System.out.println(" prin of shapes");
		// TODO Auto-generated method stub	
//	}
	public abstract void print();
	public void convertshapes() {
		System.out.println("convert shapes ");
	}
	
	
}

	
