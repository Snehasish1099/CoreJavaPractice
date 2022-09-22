/*
Program: Creation and updation of the Cart
@author: Snehasish
@date: 21st Sept, 2022
*/


class TestCart
{
	public static void main(String args[])
	{	
		//Constructor injection
		Item cake = new Item("Pure Chocolate", 10, 40);
		Item chips = new Item("Kurkure-Hyderabadi Hungama", 10, 20 );
		Item chocolate = new Item("Amul's Dark Chocolate", 5, 100);
		Item drinks = new Item("2L Cocacola", 5, 85);
		
		ShoppingCart myCart = new ShoppingCart();
		
		//Updating the cart
		myCart.addItem(cake);
		myCart.addItem(chips);
		myCart.addItem(chocolate);
		myCart.addItem(drinks);
		
		
		System.out.println("Total bill is "+myCart.calcBill());    /////////
	}
}