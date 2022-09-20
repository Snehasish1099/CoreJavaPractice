/*
Program: Finding the Simple Interest
@author: Me
@Date: 9th Sept, 2022
*/

// Declaring the class 
class SimpleInterest
{
	public static void main(String args[])     //Calling The Main Method
	{
	int p = Integer.parseInt(args[0]);  //Principal
	int r = Integer.parseInt(args[1]); //Rate
	int t = Integer.parseInt(args[2]); //Time
	int ans = (p*r*t)/100; //Gives the Simple Interest
	
	System.out.println("The Simple Interest is: "+ ans);
	}
}