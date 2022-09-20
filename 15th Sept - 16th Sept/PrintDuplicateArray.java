/*
Program: Traversing a 2D array
*/

import java.util.Scanner;

//Declaring the class 
class PrintDuplicateArray
{
	static void inputArray()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int rows= sc.nextInt();
		
		int arr[]= new int[rows];
		
		System.out.println("Enter the elements:");	//For users to enter the elements as i/p
		
		
		for(int i=0;i<rows;i++)
		{	
	     	arr[i]= sc.nextInt();	
		}
		
		System.out.println();
		
		System.out.println("Array elements are:");
        displayArray(arr);	//Displays the elements of the array entered
		
		
		System.out.println();
		
		System.out.println("Duplicate elements are:");	//Shows us the duplicate elements
        duplicate(arr);
		
	}
	
	static void displayArray(int myArray[])
	{
	   System.out.println();
	   for(int myrow:myArray)
	   {
		System.out.print(myrow+ " ");
	   }
	}
	
	static void duplicate(int ar[])
    {
	   for(int i=0; i<ar.length;i++)
	   {
		   for(int j=i+1;j<ar.length;j++)
		   {
			   if(ar[i]==ar[j])
				   System.out.print(ar[i]+ "  ");
		   }
	   }
    }
	
	//Calling the main method
	public static void main(String args[])
    {
		inputArray();
	}
}   