package com.acorn;

import java.util.Scanner;

public class Run3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		String userStr = sc.next();
		System.out.println("첫 번째 문자: "+userStr.substring(0,1));
		System.out.println("두 번째 문자: "+userStr.substring(1,2));
		System.out.println("세 번째 문자: "+userStr.substring(2,3));
		sc.close();
	}
}
