package quiz01;
import java.util.Scanner;
public class Quiz06 {
	public static void main(String[] args) {
		//입력 3개
		//결과 출력
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수1>");
		int a = scan.nextInt();
		
		System.out.println("연산을 선택하세요[+, -, *, /]>");
		String p = scan.next();
		
		System.out.println("정수>");
		int b = scan.nextInt();
		
		
		switch (p) {
		case "+":
			System.out.println("두 수의 덧셈은:" + (a+b));
			break;
			
		case "-":
			System.out.println("두 수의 뺄셈은:" + (a-b));
			break;
			
		case "*":
			System.out.println("두 수의 곱하기는:" + (a*b));
			break;
			
		case "/":
			System.out.println("두 수의 나누기는:" + (a/b));
			break;
	
		default:
			System.out.println("[+, -, *, /]를 입력하세요");
			break;
		}
	}

}
