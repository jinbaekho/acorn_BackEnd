package com.acorn.d0804;

import java.util.Scanner;

public class Study1 {
	static int[] game = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public static void main(String[] args) {
		newN();		
	}
	
	public static void newN() {
		while (true) {
			int x = (int) Math.round(Math.random() * 8);
			if (game[x] == 0) {
				game[x] = (int) Math.round(Math.random() * 1) + 1;
				break;
			}
		}
		DP();
		Scanner sc = new Scanner(System.in);
		System.out.println("이동");
		int MV = sc.nextInt();
		if(MV==5) {newN(game);}
		else if(MV==2) {DOWN(game);}
//		sc.close();
	}
	
	public static void DP() {
		System.out.println(game[0] + " " + game[1] + " " + game[2]);
		System.out.println(game[3] + " " + game[4] + " " + game[5]);
		System.out.println(game[6] + " " + game[7] + " " + game[8]);
	}
	
	public static void DOWN() {
		for(int i=5;i>=0;i--) {

			if(game[i]==0) {continue;}
			else {
			if(game[i+3]==0)
				{
				game[i+3]=game[i]+game[i+3];
				game[i]=0;
				}
			else if(game[i]==game[i+3])
				{
				game[i+3]=game[i]+game[i+3];
				game[i]=0;
				}
			}
		}
		newN();
	}
	
}
