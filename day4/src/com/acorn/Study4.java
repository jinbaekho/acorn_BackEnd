package com.acorn;

import java.util.Arrays;
import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 단어 ㄱ");
		String str = sc.next();
		String[] arr = new String[str.length()];
		for (int i = 0; i < str.length(); i++)
			arr[i] = str.charAt(i) + "";
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
