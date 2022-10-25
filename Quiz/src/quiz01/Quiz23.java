package quiz01;

public class Quiz23 {
	public static void main(String[] args) {
		//1. iava 함수는 매개변수로 숫자를 받습니다.
		//2. 매개변수 숫자길이만큼 패턴 "자바자바자바.."를 리턴하는 함수를 완성하세요
		//1이면 자, 2이면 자바, 3이면 자바자, 4이면 자바자바
		
		String str = java(5);
		System.out.println(str);
	}
	static String java(int n) {
		String s = "";
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) { //i = 1, 3, 5, 7...
				s += "자";
			}else { // i = 2, 4, 6, 8
				s += "바";
			}
		}
		return s;
		

	}
	
}
