package fwer;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//부족한 숫자
		//숫자로 구성된 길이가 정확히 9인 문자열 S가 주어진다. 0부터 9까지의 모든 숫자가 S에 정확히 한 번 나타난다.
		//S에서 누락된 유일한 숫자를 인쇄하라.
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); //엔터키값을 기준으로 나누어줌
		String[] arr = s.split("");
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		int result = 45-sum;
		
		System.out.println(result);
		
		
	}

}
