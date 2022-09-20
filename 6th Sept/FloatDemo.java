/*
Program: 
@author: Me
@Date: 6th Sept, 2022
*/

//Calling a class
class FloatDemo{
	public static void main(String args[]){
		float f1 = Float.parseFloat(args[0]);
		float f2 = Float.parseFloat(args[1]);
		float f3 = Float.parseFloat(args[2]);
		float avg = (f1 + f2 + f3)/3;
		System.out.println(avg);		//Prints the O/P in float
	}
}