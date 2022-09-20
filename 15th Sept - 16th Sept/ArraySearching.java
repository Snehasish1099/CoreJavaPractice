/*
Program :Search an element in an array
@author: Me
@date: 14th Sept, 2022
*/

import java.util.Scanner;

class ArraySearching
{
	static void searchElement(int s, int arr[])
    {
		boolean status = false;
	    //Print the elements of the array
		for(int i=0;i<arr.length;i++)
		{
		if(s==arr[i])
		{
			status= true;
		    break;
		}		
	}
	if(status){
		System.out.println("Element Found");
		}
	 else
		System.out.println("Element not found"); 
    }   

	static void inputArr(){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the size of the array: ");
	    int size = sc.nextInt();
		int newArr[] = new int[size];

		System.out.println("Enter the elements of the array: ");

		for(int i=0;i<size;i++) 
		{
			newArr[i]= sc.nextInt() ;
		}
		System.out.println();
		System.out.println("Enter the element to be searched: ");
		int num = sc.nextInt();
		searchElement(num,newArr);
	}
	
	public static void main(String args[])
    {
		inputArr();
	}

}