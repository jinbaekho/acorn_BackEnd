package com.acorn;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("중간고사 점수를 입력해주세요");	int mT=sc.nextInt();
		System.out.println("기말고사 점수를 입력해주세요");	int lT=sc.nextInt();
		System.out.println("과제점수를 입력해주세요");		int hW=sc.nextInt();
		System.out.println("출석일을 입력해주세요(?/20)");	int aD=sc.nextInt();
		
		System.out.println("\n\n\n\n중간고사: "+mT+"점");
		System.out.println("기말고사: "+lT+"점");
		System.out.println("과제: "+hW+"점");
		System.out.println("출석: "+aD+"일");
		
		int tS=(mT*2/10)+(lT*3/10)+(hW*3/10)+(aD);
		System.out.println("\n환산점수는 "+tS+"점입니다.");
		
		if(tS>=70 && aD>=14) {System.out.println("Pass");}
		else if(tS<70&&aD<14){System.out.println("Fail : 출결,점수미달");}
		else if(tS<70){System.out.println("Fail : 점수미달");}
		else if(aD<14){System.out.println("Fail : 출결미달");}
		
		sc.close();
	}
}
