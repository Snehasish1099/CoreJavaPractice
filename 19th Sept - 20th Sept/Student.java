/*
Program: 
@author: Me
@Date: 19th Sept, 2022
*/
import java.util.Scanner;
 
class Student
{
//instance variable
 private int id;
 private String name;
 private float marks;
 private String course;
 
 
    //constructor overloading
	Student(int id,String name,float marks,String course) // parameterized constructor
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.course= course;
	}
    //to change the value of course
	void setCourse(String course)
	{
		this.course=course;
	}
 
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Marks:"+marks);
		System.out.println("Course:"+course);
	}
 
	public static void main(String ...args)
	{
		Student s = new Student();
		s.display();
		Student s1= new Student(1,"Igneel",85f,"MCA");
		s1.display();
		Student s2= new Student(99,"Acnologia",99f);
		s2.display();
  
		Student s3 = new Student();
		s3 = s2; // copying the contents directly i.e. changes are reflected
		s3.display();
	
		//changing the value of course for s2
		s2.setCourse("MCA");
		System.out.println("After changing s2 couse to MCA");
		s2.display();
		s3.display();
	
	}

}