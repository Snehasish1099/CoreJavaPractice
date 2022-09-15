/*total marks<60 : not eligible
           >60 : eligible

B.Tech
 totalmarks > 80
 pcmMarks > 85
 
*/
 
/*
Program: Finding the EligibleDemo
@author: Me
@Date: 9th Sept, 2022
*/

// Declaring the class 
class EligibleDemo{
	public static void main(String args[])     //Calling The Main Method
	{ 	float totalMarks = Float.parseFloat(args[0]);
		float pcmMarks = Float.parseFloat(args[1]);
		if(totalMarks > 60){
			if((totalMarks >= 80) || (pcmMarks >= 90))
			{
				System.out.println("Eligible for B.Tech");
			}
			else 
			{
				System.out.println("Eligible but not for B.Tech");
			}
		}
		
		else
			System.out.println("Not Eligible at all");
	}
}