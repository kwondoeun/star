package day01;

public class OperatorEx03 {
	public static void main(String[] args) {
		
		int x= 10;
		int y= 20;
		
		//if 뒤에는 조건이 옴. true라면 if문 실행, false라면 else문 실행
		//&&, ||는 앞항을 검사해서 결과가 정해지면, 뒤를 실행하지 않음 (보통 위에 논리연산자보다 많이 사용됨)
		if(x != 10 && ++y == 21) {         //첫 조건부터 false이므로 뒤에 조건은 실행하지 않음(결과-> 20)
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
			
		}
		System.out.println("x값:" +x+ ",y값:" +y);
		
		if(x == 10 || ++y == 21) {    //첫 조건부터 true이므로 뒤에 조건은 실행하지 않음
			System.out.println("참 입니다");
		}else {
			System.out.println("거짓 입니다");
		}		
		System.out.println("x값:" +x+ ",y값:" +y);
		
	}

}
