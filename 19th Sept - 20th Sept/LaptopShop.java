/*
Program: 
@author: Me
@Date: 19th Sept, 2022
*/

import java.util.Scanner;

class Laptop{
	
	String brand;
	String processor;
	float screensize;
	int model;
	double price;
	
	void insertLaptop(String processor, String brand, float screensize, int model, double price)
	{	
		this.processor = processor; 
		this.brand = brand; 
		this.screensize = screensize;
		this.model = model;
		this.price = price;
	}
		
	void display()
	{
		System.out.println(" "+processor);
		System.out.println(" "+brand);
		System.out.println(" "+screensize);
		System.out.println(" "+model);
		System.out.println(" "+price);
	}
	
}

class LaptopShop 
{
	public static void main(String args[])
	{
		Laptop laptop = new Laptop();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Processor ");
		laptop.processor = sc.next();
		
		System.out.println("Brand ");
		laptop.brand = sc.next();
		
		System.out.println("Screensize ");
		laptop.screensize = sc.nextFloat();
		
		System.out.println("Model ");
		laptop.model = sc.nextInt();
		
		System.out.println("Price ");
		laptop.price = sc.nextDouble();
		
		System.out.println("The specifications you entered are:  ");
		laptop.display();
	}
}