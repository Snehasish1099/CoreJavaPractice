/*
Program: Finding the Simple Interest
@author: Me
@Date: 9th Sept, 2022
*/

// Declaring the class 
class EqualOrNot{
	public static void main(String args[])     //Calling The Main Method
	{ 	int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		if( n1 > n2)
		{
			System.out.println("Number 1 is greater than Number 2");
		}
		else if (n1 == n2)
		{
			System.out.println("Number 1 is equal to Number 2");
		}
		else
			System.out.println("Number 2 is greater than Number 1");
	}
}