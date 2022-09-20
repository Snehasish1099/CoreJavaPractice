/*
Program: Finding the Grade for marks
@author: Me
@Date: 12th Sept, 2022
*/

// Declaring the class 
class AsciiDemo{
	static void printAsciiValue(char cValue)    
	{	int asciiValue=cValue;
		System.out.println("The asciivalue of "+cValue +" is : "+asciiValue); //printing
	}
	
	static void checkChar(char cValue)    
	{	int asciiValue = cValue;
		if ((asciiValue>=65) && (asciiValue <=90))
		{
			System.out.println("UpperCase");
			if ((cValue == 'A') ||(cValue == 'E') ||(cValue == 'I') || (cValue == 'O') || (cValue == 'U'))
			{
			System.out.println("Vowel");
			}
			else
			System.out.println("Consonent");
		}
		
		else if ((asciiValue>=97) && (asciiValue <=122))
			{
			System.out.println("LowerCase");
			if ((cValue == 'a') ||(cValue == 'e') ||(cValue == 'i') || (cValue == 'o') || (cValue == 'u'))
			{
			System.out.println("Vowel");
			}
			else
			System.out.println("Consonent");
		}
		else if((asciiValue>=48)&&(asciiValue<=57))
		{
			System.out.println("Its a Number");
		}
		else
			System.out.println("Its a Special character");

	}
	public static void main(String args[])     //Calling The Main Method
	{ 	char value = args[0].charAt(0);
		checkChar(value);
		printAsciiValue(value);
	}
}