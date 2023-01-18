package com.citibank.main;

import java.util.Scanner;

import com.citibank.main.domain.Circle;
import com.citibank.main.domain.Line;
import com.citibank.main.domain.Shapes;
import com.citibank.main.domain.Triangle;

public class ShapesMain {

	private static final Shapes Triangle = null;
	int choice;
	public static void main(String[] args) {
	
		
//	Circle circle = new Circle();
//	circle.print();
		
// below creates two object, one is circle object and other one 
// is in circle where compiler inserts a super in circle by deafult
// which will create an object to call the parent class 
// below line  takes precedance on which ever method it has	
// below is also called top/up casting		
//	Shapes shapes = new Circle();
//	shapes.print();
// all the methods of base class and common methods of base and 
//child
//	shapes.convertshapes();
// below is a refrence as downcasting 	
//	Circle circle = (Circle) new Shapes();
	Scanner scanner = new Scanner(System.in);
	System.out.println(" 1. Circle, 2. Triangle, 3. Line");
	System.out.println("enter your choice:");
	int choice = scanner.nextInt();
	
	Shapes shapes = getshape(choice);
	shapes.draw();
	}		
		
public static Shapes getshape(int choice) {
	if(choice == 1) {
//		new Circle();
	Shapes shapes = new Circle();
	return shapes;
	}
	if(choice ==2) {
		return new Triangle();
		
	}
	if ( choice ==3) {
		return new Line();
	}
//return Shapes;
// as part of abstract class the above return line cannot create obj for shapes
// hence below has been replaced	
// 	
	return null;
	
	}

}
