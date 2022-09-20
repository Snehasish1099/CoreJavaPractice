/*
Program: Finding the EligibleDemo
@author: Me
@Date: 9th Sept, 2022
*/

// Declaring the class 
class SwitchCase{
	public static void main(String args[])     //Calling The Main Method
	{
	char grade = 'A';
	//Starting the Switch-Case conditions
	switch (grade) {
		case 'A':
			System.out.println("Outstanding");
			break;
		case 'B':
			System.out.println("Excellent");
			break;
		case 'C':
			System.out.println("Good");
			break;
		case 'D':
			System.out.println("Not good, try to Improve");
			break;
		case 'F':
			System.out.println("Better luck next year");
			break;
		}
	}
}