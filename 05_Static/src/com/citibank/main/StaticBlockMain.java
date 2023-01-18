package com.citibank.main;
import com.citibank.main.domain.StaticBlock;

public class StaticBlockMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		StaticBlock block = new StaticBlock();
//		System.out.println("main start");
		StaticBlock.show();
		StaticBlock.num1 =20;
		System.out.println("main end");

	}

}
