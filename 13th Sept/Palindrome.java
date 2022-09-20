/* 
Program:
@author: Me
@date: 13th Sept, 2022
*/

class Palindrome
{
	static void checkPalindrome(int n)
	{
		int rem = 0;
		int revNum = 0;
		int temp = n;
		while(n > 0)
		{
			rem = n%10;
			revNum = (revNum*10) + rem;
			n = n/10;
		}
		if(temp == revNum)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		checkPalindrome(num);
	}
}