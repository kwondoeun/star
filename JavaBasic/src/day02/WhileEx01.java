package day02;

public class WhileEx01 {
	public static void main(String[] args) {
		
//		int a = 1;  //제어변수: 반복문의 횟수를 결정할 변수
//		while(a <= 20) {
//			
//			System.out.println("hello" + a);
//			a++;  //제어변수 조작을 통해 반복의 조건식이 언젠가 false되도록 처리
//			
//		}
		
		//누적
		int sum = 0; //누적할 변수
		
		int i = 1;
		while(i <= 10) {
			
			sum +=i;  //sum = sum + i; //누적할 변수
			i++;
			
		}
		System.out.println("1~10까지 합:" + sum);
		
		/*
		 int sum = 0;
		 
		 sum = sum + 1;
		 */
		
		
	}

}
