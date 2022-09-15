/*A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

/*
Program: Finding the Grade for marks
@author: Me
@Date: 12th Sept, 2022
*/

// Declaring the class 
class GradeDemo{
	public static void main(String args[])     //Calling The Main Method
	{ 	//char grade = args[0].charAt(0);
		int marks = Integer.parseInt(args[0]);
		if(marks<25)
		{
			System.out.println("Grade F");
		}
		else if ((marks>=25) && (marks<45))
		{
			System.out.println("Grade E");
		}
		else if ((marks>=45) && (marks<50))
		{
			System.out.println("Grade D");
		}
		else if ((marks>=50) && (marks<60))
		{
			System.out.println("Grade C");
		}
		else if ((marks>=60) && (marks<=80))
		{
			System.out.println("Grade B");
		}
		else
			System.out.println("Grade A");
	}
}