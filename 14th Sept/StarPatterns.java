/* 
Program:
@author: Me
@date: 14th Sept, 2022
*/

class StarPatterns
{
	/*
		*
		* *
		* * *
		* * * *
	*/
	static void patternOne(int rows)
	{
		//Printing stars
		for(int i=1;i<=rows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
	}
	
	
	/*
		* * * *
		* * *
		* *
		*
	*/
	static void patternTwo(int rows)
	{
		//Printing stars
		for(int i=1;i<=rows;i++)
		{
			System.out.println();               
			for(int j=rows;j>=i;j--)       
			{
				System.out.print("* ");
			}
		}
	}


	/*
		*
		* *
		* * *
		* *
		*
	*/
	static void patternThree(int rows)
	{
		// printing stars
		for(int i=1;i<=rows;i++)
		{
			System.out.println();
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
		for(int i=2;i<=rows;i++)
		{
			System.out.println();               
			for(int j=rows;j>=i;j--)       
			{
				System.out.print("* ");
			}
		}
	}
	
	
	/*	
		   *
		  * *
		 * * *
		* * * * 
	*/
	static void patternFour(int rows)
	{
		for(int i=1;i<=rows;i++) 
		{
			System.out.println(); 
			for(int spaces=rows;spaces>i;spaces--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
		}
	}


   public static void main(String args[])
   {
	int num = Integer.parseInt(args[0]);
	//patternOne(num);
	//patternTwo(num);
	//patternThree(num);
	patternFour(num);
   }
}