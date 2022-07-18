package com.bridgelab.basic;

public class LargestNumber {

	public static void main(String[] args) {
		int num1 = 4;   
		int num2 = 3;
		int num3 = 5;

      if( num1 >= num2 && num1 >= num3) {
          System.out.println(num1 + " is largest number.");
      } else if (num2 >= num1 && num2 >= num3) {
          System.out.println(num2 + " is largest number.");
      } else {
          System.out.println(num3 + " is largest number.");
      }


	}

}
