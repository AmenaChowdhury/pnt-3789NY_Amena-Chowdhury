package com.homework;

public class Computer {
		
	static String MakeCompany = "Dell";
	static int ram =12;
	int hardDisk;
	String compuName;
	
    Computer(){
	}

    Computer (String name, int disk){
		System.out.println("Name of Computer" + name+ "Tota Storage" + disk );
		}
	
	Computer(int price){
		
		System.out.println(price);
		}

	Computer (String name, int disk, int price){
		
		
		System.out.println(name);

		System.out.println(disk);

		System.out.println(price);

	}
	
	public static void compDetails() {
		
		System.out.println(Computer.MakeCompany);
		System.out.println(Computer.ram);	
	}
	
	public void compProperty(String compuName, int HardDisk) {
 
		this.compuName = compuName;
		//this.hardDisk = hardDisk;
		System.out.println(compuName);
		System.out.println(hardDisk);
		  
	}

}
