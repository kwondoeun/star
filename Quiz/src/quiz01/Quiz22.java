package quiz01;
public class Quiz22 {
	public static void main(String[] args) {
		//1
		method1();
		
		//2
		String s = method2("d");
		System.out.println(s);
		
		//3
		double d = method3(1, 2, 3.14);
		System.out.println(d);
		
		//4
		String t = method4(5);
		System.out.println(t);
		
		//5
		method5("가", 4);
		
		//6
		int n = maxNum(4,5);
		System.out.println(n);
		
		//7
		int i = abs(-1);
		System.out.println(i);		
	}
	
	//1. 반환유형x, 매개변수x (안녕 출력)
	static void method1() {
		System.out.println("안녕");
	}
	//2. 반환유형 String, 매개변수 String (전달받은 매개 변수 리턴)
	static String method2(String s) {
		return s;
	}
	//3. 반환유형 ?, 매개변수 int, int, double (세 매개변수 합 리턴)
	static double method3(int a, int b, double c) {
		double d = a + b + c; 
		return d;
	}
	//4. 반환유형 String, 매개변수 int (매개 변수가 짝수면 "짝수", 홀수라면 "홀수"리턴)
	static String method4(int n) {
		
		if(n % 2 == 0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	//5. 반환유형 x, 매개 변수 String, int (매개 변수 int만큼 String 반복 출력)
	static void method5(String s, int n) {
		
		for(int i = 1; i <= n; i++) {
			System.out.println(s);
		}
	}
	//6. 반환유형 ?, 매개 변수 ? (매개 변수 2개를 입력받아 큰 수 리턴)
	static int maxNum(int a, int b) {
		return  a > b ? a: b;
	}
	//7. 반환유형 String, 매개 변수 int (절대값 리턴)
	static int abs(int n) {
		
		if(n > 0) {
			return n;
		}else {
			return -n;
		}
	}
	
	
}
