package com.acorn;

import java.util.Scanner;

public class Study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("계산기");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("99.종료");
			System.out.print("실행할번호를 입력해주세요 >>>>>>  ");
			
			int MN = sc.nextInt();
			if (MN == 1) {
				System.out.print("첫번째 수를 입력하세요  ");
				int FN = sc.nextInt();
				System.out.print("두번째 수를 입력하세요  ");
				int SN = sc.nextInt();
				System.out.println("결과==========> "+FN + "+" + SN + "=" + (FN + SN)+"\n");
				
			} else if (MN == 2) {
				
				System.out.print("첫번째 수를 입력하세요  ");
				int FN = sc.nextInt();
				System.out.print("두번째 수를 입력하세요  ");
				int SN = sc.nextInt();
				System.out.println("결과==========> "+FN + "-" + SN + "=" + (FN - SN)+"\n");
				
			} else if (MN == 3) {
				
				System.out.print("첫번째 수를 입력하세요  ");
				int FN = sc.nextInt();
				System.out.print("두번째 수를 입력하세요  ");
				int SN = sc.nextInt();
				System.out.println("결과==========> "+FN + "*" + SN + "=" + (FN * SN)+"\n");
				
			} else if (MN == 4) {
				
				System.out.print("첫번째 수를 입력하세요  ");
				short FN = sc.nextShort();
				System.out.print("두번째 수를 입력하세요  ");
				short SN = sc.nextShort();
				System.out.println("결과==========> "+FN + "/" + SN + "=" + (FN / SN)+"\n");
				
			} else if (MN == 99) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못입력하였습니다.\n다시입력해주세요 >>>>>>   ");
			}

		}
		sc.close();
	}

}
