/*
Program: 
@author: Me
@Date: 19th Sept, 2022
*/

import java.util.Scanner;

class BankDetails
{	 
	String name;
	int phoneNum;
	private double accountNum;
	
	void insertDetails()
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name ");
		name = sc.next();
		
		System.out.println("Enter your Phone number ");
		phoneNum = sc.nextInt();
		
		System.out.println("Enter your Account number ");
		accountNum = sc.nextDouble();
		
		System.out.println("Details recorded successfully ");
	}
	
	void displayDetails()
	{
		System.out.println("Acc. Holder "+ name);
		System.out.println("Phone No. "+phoneNum);
		System.out.println("Acc. No. "+accountNum);
	}
	
}

class Bank
{
public static void main(String args[])
	{
		Bank bankArr[] = new Bank[10];
		
		bankArr[].displayDetails();
	}
}



                     //-----------------------------------------------------NOT DONE--------------------------------------------------------//