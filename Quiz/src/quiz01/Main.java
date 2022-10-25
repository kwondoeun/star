package quiz01;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num= scan.nextInt();
		String s = scan.next();

		int sum = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			sum += c - '0';
			  //문자의 연산은 정수
		}
		System.out.println(sum);
	
		
//		String[] arr = s.split("");
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			
//			int n = Integer.parseInt(arr[i]);  //문자열을 넣으면 정수로 바꾸어서 돌려줌
//			sum += n;
//		}
//		System.out.println(sum);
				
	
	}
	
}

