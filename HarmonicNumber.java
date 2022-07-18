package com.bridgelab.basic;
import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		double result = 0, num = 0, j;
		int N;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the harmonic value : ");
		N = sc.nextInt();

		
		for (j = 1; j <= N; j++) {
			num = num + (1 / j);
			result = num;
		}
		System.out.println("Nth harmonic value of " + N + " is: " + result);

		
		
	}

}
