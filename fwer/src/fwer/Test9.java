package fwer;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
//		A - 츄코다이 
//		문제 설명
//		영문 소문자로 구성된 문자열 S가 주어진다.
//		S의 앞에서 a번째와 b번째 문자를 서로 바꾸고, 그 결과로 생긴 문자열을 인쇄하라.
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String temp = "";
		String str = "";
		
		sc.close();
		
		String[] arr = s.split("");
		
		temp = arr[a-1];
		arr[a-1] = arr[b-1];
		arr[b-1] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		System.out.println(str);

	}

}
