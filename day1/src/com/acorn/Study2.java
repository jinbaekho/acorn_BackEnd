package com.acorn;

public class Study2 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			
			for(int k=10;k-i>0;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int NNN=0;
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		fufu(NNN++);
		
		
		
		int [] NumberSet = {0,0};
		int Vwhile = 1;
		while(Vwhile<=30){
			if(Vwhile%2==0) {NumberSet[1]++;} else {NumberSet[0]++;}
			Vwhile++;
		}
		System.out.println("홀수의 갯수:"+NumberSet[1]+"\n짝수의 갯수:"+NumberSet[0]);
		
	}//끝
public static void fufu(int in) {
	byte[] bNumberArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		 if(bNumberArr[in] % 10 == 0) {System.out.print("10의배수입니다");}
	else if(bNumberArr[in] % 9 == 0) {System.out.print("9의배수입니다");} 
	else if(bNumberArr[in] % 8 == 0) {System.out.print("8의배수입니다");} 
	else if(bNumberArr[in] % 7 == 0) {System.out.print("7의배수입니다");} 
	else if(bNumberArr[in] % 6 == 0) {System.out.print("6의배수입니다");} 
	else if(bNumberArr[in] % 5 == 0) {System.out.print("5의배수입니다");} 
	else if(bNumberArr[in] % 4 == 0) {System.out.print("4의배수입니다");} 
	else if(bNumberArr[in] % 3 == 0) {System.out.print("3의배수입니다");} 
	else if(bNumberArr[in] % 2 == 0) {System.out.print("2의배수입니다");} 
	else if(bNumberArr[in] % 1 == 0) {System.out.print("1의배수입니다");} 
		 if(bNumberArr[in] % 2 == 0) {System.out.println(" 짝수");} else {System.out.println(" 홀수");} 
	}
}