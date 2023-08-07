package com.acorn;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		wHI: while (true) {
			System.out.println("\n비밀번호입력\n(취소하시려면\"20000\"입력)");
			int userPW = sc.nextInt();
			String stPW = userPW + "";
			
			if (userPW == 20000) {System.out.println("종료");break;}
			if (userPW > 9999||stPW.length()!=4) {System.out.println("\n\n\n자리수");continue;}

			for (int i = 0; i < 3; i++) {
				for (int j = i + 1; j <= 3; j++) {
					if (stPW.charAt(i) == stPW.charAt(j)) {
						System.out.println("\n\n\n중복");
						continue wHI;
					}
				}
			}
			System.out.println("설정완료");
			sc.close();
			break;
		}
	}
}
