package com.bridgelab.basic.copy2;

public class FlipCoin {
	
	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		
		for (int i=0; i<10; i++) {
			int coin = (int) Math.floor(Math.random() * 10) % 2;
			
			if (coin == 1) {
				head++;
			} else {
				tail++;
			}
		}
		if (head >= 5) {
			int percent = (head*10);
			System.out.println("Head " + percent + "%");
		}else {
			int percent = (tail*10);
			System.out.println("Tail " + percent + "%");
		}
	}

}
