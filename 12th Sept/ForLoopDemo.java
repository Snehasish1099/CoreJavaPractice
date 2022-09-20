/*
*/

class ForLoopDemo 
{	
	static void printNumbers(int t)
	{	
		for(int i = 0; i<t; i++){
			System.out.println(i);
		}
	}
	
	static void printTable(int num)
	{	
		System.out.println("Printing the table of:"+ num);
		for(int i=1;i<=10;i++){
		   System.out.println(num + " X "+ i+ " = "+ (num*i));
	    }
	}
	
	public static void main(String args[]) {	
		int total = Integer.parseInt(args[0]);
		printNumbers(total);
	}
}