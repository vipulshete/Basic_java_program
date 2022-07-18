package com.bridgelab.basic;

public class NumberSwap {

	public static void main(String[] args) {
		int first= 12;  
		int second = 14;
		
		System.out.println("Numbers are " + first  + ", " + second);
  
        int  temporary = first;
        first = second;
        second = temporary;

        System.out.println("Swap numbers are " + first + ", " + second);

	}

}
