/* 
Program:
@author: Me
@date: 13th Sept, 2022
*/

class FactorialDemo{
	static void createFactorial(int n){
		long result = 1L;
		for(int i = 1 ; i <= n; i++){
			result = result*i;
		}
		System.out.println("Factorial of " +n+" is "+result);
	}
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		createFactorial(num);
	}
}