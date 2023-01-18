package com.citibank.main.domain;

public class Line extends Shapes {

	public Line() {
		System.out.println(" default constructor is line");
	}
	public Line(int size)
	{
		System.out.println("parm consturctore of line" + size);
	}
	public void draw() {
		System.out.println("Drawing Line");
	}
	public void print() {
		System.out.println("Drawing Line");
	}
}
