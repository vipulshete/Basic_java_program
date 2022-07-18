package com.bridgelab.basic;
import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		
		int number; int  mul =1 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Power Value N :");
		number =sc.nextInt();
		if (number > 31) {
			System.out.println("value of number should be less than 31");
			return;
		}

		else {
			System.out.println(mul);
			for (int j = 1; j <= number; j++) {
				mul = mul * 2;
				System.out.println(mul);
			}
		}	
	}

}
