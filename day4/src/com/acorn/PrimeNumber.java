package com.acorn;

public class PrimeNumber {
	public static void main(String[] args) {
		for (int i = 2; i < 1000000; i++) {
			for (int j = 2; j <= i; j++) {
					if(i%j==0&&i>j) {break;}
					if(i==j) {System.out.println(i);
					}
				}
			}
		}
	}