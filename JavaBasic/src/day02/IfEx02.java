package day02;

import java.util.Scanner;

public class IfEx02 {
	public static void main(String[] args) {
		
		//입력받은 점수에 따라서 A, B, C, D, F로 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수>");
		int point = scan.nextInt();
		
		
		String grade = null;  //변수의 선언
		
		if(point >= 90) {
			//조건검사 또
			if(point >= 95) {
				grade = "A+";
			}else {//90~94
				grade = "A";
			}
		} else if (point >= 80) {       //80~89
			grade = "B";
		} else if (point >= 70) {
			grade = "C";
		} else if (point >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println(grade);
		
		
	}

}
