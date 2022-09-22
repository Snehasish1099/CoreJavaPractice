/*
Program: Bin class for Cart
@author: Snehasish
@date: 21st Sept, 2022
*/

//Declaring the class Item
class Item
{
	//Instance variables
	private String cartItem;
	private int cartQuantity;
	private double totalPrice;
	
	Item()
	{
		
	}
	
	//Constructor
	Item (String cartItem, int cartQuantity, double perPrice)
	{
		this.cartItem = cartItem;
		this.cartQuantity = cartQuantity;
		this.totalPrice = cartQuantity * perPrice;
	}
	
	void insertItem()
	{ 
		System.out.println("Enter the details of Item:");
	   
		System.out.println("Item Name:");          //printing item name
		this.itemName= sc.next();
	   
		System.out.println("Quantity :");              //printing quantity
		this.quantity= sc.nextInt();
		
		System.out.println("Total Price:");                //printing total price
		this.totalPrice= sc.nextDouble();	
	}
	
	void displayItem()		//Displays output as shown in the below format
	{
		System.out.println("Item Name: "+ this.itemName+" "+ "Quantity:"+ this.quantity+ " "+"Total Price:  "+this.totalPrice);
	}
	
	
	//Getter and Setter for...
	
	public void setCartItem(String cartItem) 		//cartItem
	{
		this.cartItem = cartItem;
	}
	public String getCartItem()
	{
		return this.cartItem;
	}
	
	
	public void setCartQuantity(int cartQuantity)		//cartQuantity
	{
		this.cartQuantity = cartQuantity;
	}
	public int getCartQuantity()
	{
		return this.cartQuantity;
	}
	

	public void setTotalPrice(double totalPrice)		//totalPrice
	{
		this.totalPrice = totalPrice;
	}
	public double getTotalPrice()
	{
		return this.totalPrice;
	}
	
}
