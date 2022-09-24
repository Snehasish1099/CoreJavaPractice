/*
Program: Display the given person's details 
@author: Snehasish
@date: 
*/

//Creating the class CheckPerson
class CheckPerson
{
	//Calling the main method
	public static void main(String args[])
	{
		Person p1 = new Person("Snehaish", 22 , "Male");
		Person p2 = new Person("Snehaish the Great", 23 , "God");
		//Person.changeLocation("Chicago ");
		p1.display();
		p2.display();
	}
}