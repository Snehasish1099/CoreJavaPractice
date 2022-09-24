/*
Program: Static Calculator
@author: Snehasish
@date: 
*/

import java.util.Scanner;
//Creating the class Calculator
class Calculator
{
	//Initializing the default answer
	static double answer = 0.0;
	
	//Creating functions for Operations...
	double add(double n1, double n2)
	{
		return n1+n2;
	}
	
	double sub(double n1, double n2)
	{
		return n1-n2;
	}
	
	double multi(double n1, double n2)
	{
		return n1*n2;
	}
	
	double div(double n1, double n2)
	{
		return n1/n2;
	}
	
	//calling the main method
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		char operator, choice;
		
		System.out.println("Enter the numbers");	//User inputs 2 numbers
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
		
		Calculator calc = new Calculator();
		while(true)
		{
			System.out.println("Enter the operator");	//User inputs the operator 
			operator = sc.next().charAt(0);
			
			//Switch-Case conditions to perform the operations
			switch(operator)
			{
				case '+': Calculator.answer = calc.add(n1, n2);
							break;
				case '-': Calculator.answer = calc.sub(n1, n2);
							break;
				case '*': Calculator.answer = calc.multi(n1, n2);
							break;
				case '/': Calculator.answer = calc.div(n1, n2);
							break;
				default: System.out.println("Please enter a valid operator :/");
			}
			
			System.out.println(n1+"  "+operator+" "+n2+" = "  +Calculator.answer);
			System.out.println("Wanna continue? ");		
			choice = sc.next().toLowerCase().charAt(0);
			
			if(choice == 'y')			//if the user wants to continue,
			{
				n1 = Calculator.answer;
				System.out.println("Enter the new number");
				n2 = sc.nextDouble();
			}
			else
				break;
		}
	}
}