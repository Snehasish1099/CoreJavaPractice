/*
Program: Project based on Array 
@author: Snehasish
@Date: 20th Sept, 2022
*/

class Threatre
{
	//instance variables
	private String movieName;
	private String movieTime;
	private double ticketPrice;
	
	Threatre(String movieName, String movieTime, double ticketPrice)
	{	this.movieName = movieName;
		this.movieTime = movieTime;
		this.ticketPrice = ticketPrice;
	}
	
	void displayMovie()
	{
		System.out.println(" Movie name: "+movieName+",  Timing: "+movieTime+", Price: "+ticketPrice);
	}
}

class Movie
{
	public static void main(String args[])
	{
		Threatre movies[] = new Threatre[3];
		
		movies[0] = new Threatre("Dinkirk", "1 am - 3 am", 300);
		movies[1] = new Threatre("Inception", "3 am - 5 am", 250);
		movies[2] = new Threatre("The Joker", "5 am - 7 am", 400);
		
		for(int i = 0; i < movies.length; i++)
		{
			movies[i].displayMovie();	
		}
		
	}
}