/* 
Program:
@author: Me
@date: 13th Sept, 2022
*/

class TernaryDemo {
	static void ternaryEvenOdd(int n){
		String result = (n%2==0)?"Even":"Odd";
		System.out.println(result);
	}
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		ternaryEvenOdd(num);
	}
}