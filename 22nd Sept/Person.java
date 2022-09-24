/*
Program: Display the given person's details 
@author: Snehasish
@date: 
*/

class Person
{
	//Instance variables
	private String name;
	private int age;
	private String gender;
	private static String location;
	
	//Creating parameterized Constructor
	Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		location = "Kolkata";
	}
	
	/* static void changeLocation(String newLocation)
	{
		location = newLocation;
	}
	
	static String getLocation()
	{
		return location;
	} */
	
	//Displays the o/p in the below format
	void display()
	{
		location = "Kolkata";
		System.out.println("Name: "+this.name+", Age "+this.age+", Gender: "+this.gender+", Place: "+location);
	}
}