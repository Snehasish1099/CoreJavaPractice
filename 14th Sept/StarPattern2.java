/* 
Program:
@author: Me
@date: 14th Sept, 2022
*/
public class StarPattern2
{  
	static void pyramidPattern(int n){
		for(int i = 1 ; i <=n; i++){
			System.out.println(" ");
			for(int j = 0 ; j <= n - i ; j++){
				System.out.print("* ");
			}
		}
	}
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		pyramidPattern(num);
	}
}  