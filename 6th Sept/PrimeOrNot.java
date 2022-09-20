/*
Program: Prime or Not
@author: Me
@Date: 6th Sept, 2022
*/

class PrimeOrNot {

  public static void main(String[] args) {
    int num = 7;
    boolean flag = false;
    for (int i = 2; i <= num / 2; i++) {
      //Condition for not prime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}