/*
Program: Bin class for Cart
@author: Snehasish
@date: 21st Sept, 2022
*/


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
		Scanner sc= new Scanner(System.in);    //for taking i/p
	  
		System.out.println("Enter the details of Item:");
	   
		System.out.println("Item Name:");          //printing item name
		this.itemName= sc.next();
	   
		System.out.println("Quantity :");              //printing quantity
		this.quantity= sc.nextInt();
		
		System.out.println("Total Price:");                //printing total price
		this.totalPrice= sc.nextDouble();	
	}
	
	void displayItem()
	{
		System.out.println("Item Name: "+ this.itemName+" "+ "Quantity:"+ this.quantity+ " "+"Total Price:  "+this.totalPrice);
	}
	
	
	//Getter and Setter 
	
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