/*
Program: Project of Shopping cart
@author: Snehasish
@date: 21st Sept, 2022
*/

//Declaring the class ShoppingCart
class ShoppingCart
{
	//Declaring instance variables
	private Item[] cart;
	private double bill;
	private int storedItems;
	
	//
	ShoppingCart()
	{
		cart = new Item[4]; 	//Constructor to create the specified no. of items i.e. here 4
	}
	//
	
	
	public double calcBill()
	{
		for(int i=0; i<cart.length; i++)
		{
			bill += cart[i].getTotalPrice();  //Calculates the bill by adding the total price of each items
		}
		return bill;
	}
	
	public void addItem(Item input)               		//For adding newitems in the cart if possible
	{
		if(storedItems < cart.length)
		{	cart[storedItems] = input;
			storedItems++;
			System.out.println(input.getCartItem() + ": " + input.getTotalPrice());
			//System.out.println("You still have space inside your cart");
		}
		else 
			System.out.println("Your cart is Full");
	}
}
