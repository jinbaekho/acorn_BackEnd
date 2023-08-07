package com.acorn.d0804;

import java.util.Scanner;

public class Study1 {
	public static void main(String[] args) {
		int[] game = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		newN(game);		
	}
	
	public static void newN(int[] game) {
		while (true) {
			int x = (int) Math.round(Math.random() * 8);
			if (game[x] == 0) {
				game[x] = (int) Math.round(Math.random() * 1) + 1;
				break;
			}
		}
		DP(game);
		Scanner sc = new Scanner(System.in);
		System.out.println("이동");
		int MV = sc.nextInt();
		sc.close();
		if(MV==5) {newN(game);}
	}
	
	public static void DP(int[] game) {
		System.out.println(game[0] + " " + game[1] + " " + game[2]);
		System.out.println(game[3] + " " + game[4] + " " + game[5]);
		System.out.println(game[6] + " " + game[7] + " " + game[8]);
	}
}
