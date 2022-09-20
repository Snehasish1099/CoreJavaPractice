/*
Program: Finding the EligibleDemo
@author: Me
@Date: 12th Sept, 2022
*/

// Declaring the class 
class SwitchCaseMonth{
	public static void main(String args[])     //Calling The Main Method
	{
	String monthName = args[0].toUpperCase();
	//Starting the Switch-Case conditions
	switch (grade) {
		case "JANUARY":
		case "MARCH":
		case "MAY":
		case "AUGUST":
		case "DECEMBER":
			System.out.println("31");
			break;
		case "FEBRUARY":
			System.out.println("28");
			break;
		case "APRIL":
			System.out.println("30");
			break;
		}
	}
}