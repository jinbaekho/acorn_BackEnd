package com.acorn.d0804;

import java.util.Scanner;

public class Study2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 수를 입력해주세요.");
		while (true) {
			int fN = sc.nextInt();
			if (fN >= 1) {
				for (; fN >= 1; fN--) {
					System.out.print(fN + " ");
				}
				break;
			} else {
				System.out.println("잘못입력하셨습니다.다시입력해주세요");
				continue;
				
			}			
		}
		sc.close();
	}
}
