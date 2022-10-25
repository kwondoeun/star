package fwer;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		
		//정수 N이 주어진다. N이 -231과 231-1(포함) 사이에 있으면 Yes를 인쇄하고, 그렇지 않으면 No를 인쇄하라.

		
		Scanner sc = new Scanner(System.in);
		
		double d = sc.nextDouble();
		double min = Math.pow(-2, 31);
		double max = Math.pow(2, 31)-1;
		
		if(min <= d && d <= max) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
