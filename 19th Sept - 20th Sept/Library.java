/*
Program: Project based on Array 
@author:Snehasish
@Date: 20th Sept, 2022
*/

import java.util.Scanner;	//Importing the Scanner class


class Book
{
	//Declaring the properties
	private String bookName;
	private String bookType;
	private String author;
	
	//Method to take the details of the book
	void checkBook(String bookName, String bookType, String author)
	{
		this.bookName = bookName;
		this.bookType = bookType;
		this.author = author;
	}
	
	//method to display the details of book
	void displayBook()
	{
		System.out.println("Book name is "+bookName+ "  which is a/an  "+bookType+ " book written by  "+author);
	}
	
}



class Library
{
	//Declaring the main method
	public static void main(String args[])
	{
		//Creating objects
		Book book1 = new Book();
		book1.checkBook("Huckelberry Finn", "English", "Mark Twain");
		
		Book book2 = new Book();
		book2.checkBook("Elements of Physics", "Physics", "Dutta-Pal-Gucchait");
		
		Book book3 = new Book();
		book3.checkBook("Rudiments of Mathematics", "Mathematics", "Mukherjee-Dasgupta-Mukherjee");
		
		//Display all the books
		book1.displayBook();
		book2.displayBook();
		book3.displayBook();
	}
}