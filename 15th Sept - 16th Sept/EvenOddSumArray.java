/*
Program : Entering elements in array and computing even and odd sums
@author: Me
@date: 14th Sept, 2022
*/

import java.util.Scanner;

class EvenOddSumArray
{ 
	static void evenOdd()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size= sc.nextInt();
	int evenSum=0,oddSum=0;
	
	int arr[]= new int[size];  //declaring the array
	System.out.println("Enter the elements:");
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();         //entering the elements in an array
	}

	// traversing an array and checking the number is even or odd
	for(int i=0;i<size;i++)
	{
		if(arr[i]%2==0)// check if the number is even
		{
			evenSum+=arr[i]; // evenSum= evenSum+arr[i]
		}
		else
			oddSum+=arr[i];
	}

	System.out.println("Sum of even elements:"+evenSum);
    System.out.println("Sum of odd elements:"+oddSum);
    }
	public static void main(String args[])
	{
     evenOdd();
    }
}