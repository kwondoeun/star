package quiz01;
import java.util.Scanner;
public class Quiz21 {
	public static void main(String[] args) {
		
		//메서드로 변환
		//1 - 입력받은 값을 반환시키고 (재활용)
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		//2
//		int result =a+b;
//		//3
//		System.out.println("두수의합:" +result);
		
		System.out.println("두 수 입력>");
		int a = input();
		int b = input();
		
		int result = add(a,b);
		
		show(result);
		
	} //end main
	
	//3개
	static int input() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		return a;
	}
	
	static int add(int a, int b) {
		return a+b;
	}
	
	static void show(int result) {
		System.out.println("두 수의 합:"+ result);
	}
	
}
