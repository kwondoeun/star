package day04;

public class MethodEx01 {
	public static void main(String[] args) {
		//메서드는 메서드 내부에 생성 할 수 없음
		//main밖에, 클래스 안에 어디서든 선언 할 수 있음.
		
		//메서드의 호출- 이름()
		//System.out.println(calSum());
		
		int result = calSum();
		System.out.println(result);
		//메서드 재활용
		int result2 = calSum();
		System.out.println(result2);
		
		String result3 = ranStr();
		System.out.println(result3);
		
		String result4 = ranStr2();
		System.out.println(result4);
		
	} //메인 끝
	
	//반환은o 매개값x - 1부터 10까지 합
	static int calSum() {
		//1~10까지 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	//반환은o 매개값x - 문자열의 결과 반환
	static String ranStr() {
		
		String str = ""; //A + B + C... +Z
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str; //String의 기본값 null
	}
	
	//반환은o 매개값x = return키워드의 활용
	static String ranStr2() {
		double d = Math.random();
		
		if(d > 0.66) {
			return "가위";
		}else if(d > 0.33) {
			return "바위";
		}else {
			return "보";
		}
		
		/*
		String str;
		if(d > 0.66) {
			str = "가위";
		}else if(d > 0.33) {
			str = "바위";
		}else {
			str = "보";
		}
		return str;
		*/
	}

}
