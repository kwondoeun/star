package fwer;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
//		다카하시의 집에는 다카하시, 그의 아버지, 그의 어머니, 이렇게 3명이 살고 있다. 그들 모두는 매일 밤 화장실에서 머리를 감는다.
//		아버지, 어머니, 다카하시의 차례로 목욕을 하고, 각각 A, B, C 밀리리터의 샴푸를 사용한다.
//
//		오늘 아침, 그 병에는 V 밀리리터의 샴푸가 들어있었다. 리필하지 않고, 머리를 감을 샴푸가 가장 먼저 부족하게 될 사람은 누구인가?
//      출력
//		머리를 감을 샴푸가 가장 먼저 부족하게 될 사람이 다카하시의 아버지라면 F를, 다카하시의 어머니라면 M을, 다카하시라면 T를 인쇄한다.
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt(); 
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		
		while(true) {
			
			if(v >= a) {
				v -= a;
			}else {
				System.out.println("F");
				break;
			}
			if(v >= b) {
				v -= b;
			}else {
				System.out.println("M");
				break;
			}
			if(v >= c) {
				v -= c;
			}else {
				System.out.println("T");
				break;
			}
			
			
		}
		

	}

}
