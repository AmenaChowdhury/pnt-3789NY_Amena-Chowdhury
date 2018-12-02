package com.homework;

public class TestComputer {

	
	public static void main(String[] args) {
		
		Computer.compDetails();
		Computer c2 = new Computer();
		c2.compProperty("home", 150);
		System.out.println(c2.compuName);
		System.out.println(c2.hardDisk);
		
	}
}
