package com.acorn;

import java.util.Scanner;

public class Study01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어몇?");
		int ko = sc.nextInt();
		System.out.println("영어몇?");
		int en = sc.nextInt();
		System.out.println("수학몇?");
		int ma = sc.nextInt();
		if(ko<60) System.out.print("국어과목 ");
		if(en<60) System.out.print("영어과목 ");
		if(ma<60) System.out.print("수학과목 ");
		System.out.println("당신의 총점수는 "+(ko+en+ma)+"점");
		if(ko<60 || en<60 || ma<60) System.out.print("과락입니다.\n불합격"); 
		else if((ko+en+ma)/3<80) System.out.println("평균점수는 "+(ko+en+ma)/3+"점으로 합격점 미달입니다.\n불합격");
		else System.out.println("평균점수는 "+(ko+en+ma)/3+"점\n합격");
		
		sc.close();
	}//End

	
}
