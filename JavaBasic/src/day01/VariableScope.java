package day01;

public class VariableScope {
	public static void main(String[] args) {
		
		int num1= 10, num2= 20;
		int num4= 0; // 초기값
		// 변수는 해당 중괄호 안에서만 사용할 수 있음
		// main안에서 만들어진 변수를 지역변수 라고 부름
		if(true) {
			
			int num3= num1 + num2;
			System.out.println(num3);
			
			num4 = 200; //변경가능
		}
		
		int num3= 100;
		System.out.println(num3);  //100
		
		System.out.println(num4);
	}

}
