package day01;

public class OperatorEx02 {
	public static void main(String[] args) {
		
		//2항 연산자 - 항이 2개인 연산자
		int i= 7/3;  //몫 2
		int j= 7%3;  //나머지 1
		int k= 7*3;  //곱 21
		
		//비교연산
		System.out.println(i == j);  //false
		System.out.println(i != j);  //true
		System.out.println(i >= 1);  //true
		System.out.println(i < j);  //false
		System.out.println(k != 21); //false
		
		System.out.println(k % 2 != 0);  //true     //짝수인지 홀수인지 구분 가능 true면 짝수
		System.out.println(k % 2 == 0);  //false    //짝수인지 홀수인지 구분 가능 false면 홀수
		System.out.println(k % 7 == 0);  //true     //7의 배수
	}

}
