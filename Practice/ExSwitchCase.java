/*
Program: Finding the EligibleDemo
@author: Me
@Date: 12th Sept, 2022
*/

// Declaring the class 
class ExSwitchCase{
	public static void main(String args[])     //Calling The Main Method
	{
	String sports = args[0].toLowerCase();
	//Starting the Ex Switch-Case conditions
	switch (sports) 
	{
		case "FOOTBALL" -> System.out.println("I love " +sports);
		case "CRICKET" -> System.out.println("I love " +sports);
		case "SWIMMING" -> System.out.println("I love " +sports);
		case "BADMINTON" -> System.out.println("I love " +sports);
		default -> System.out.println("Nothing");
	}
}
}