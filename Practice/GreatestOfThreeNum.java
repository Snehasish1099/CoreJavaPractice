/*
Program: Finding the Simple Interest
@author: Me
@Date: 9th Sept, 2022
*/

// Declaring the class 
class GreatestOfThreeNum{
	public static void main(String args[])     //Calling The Main Method
	{ 	int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int n3 = Integer.parseInt(args[2]);
		if((n1 >= n2) && (n1 >= n3))
		{
			System.out.println(n1+" is greatest");
		}
		else if ((n2 >= n1) && (n2 >= n3))
		{
			System.out.println(n2+" is greatest");
		}
		else
			System.out.println(n3+" is greatest");
	}
}