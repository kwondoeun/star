package day10.exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {
	public static void main(String[] args) {
		
		//입력과 예외처리
		//0을 입력하기 전까지 숫자를 입력.
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print(">");
				int num = scan.nextInt(); //정수를 받음
				//int num = Integer.parseInt(scan.nextLine());
				
				if(num == 0) break;
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				scan.nextLine(); //엔터개행을 제거
				
			}
			
			
		}
		
		
	}

}
