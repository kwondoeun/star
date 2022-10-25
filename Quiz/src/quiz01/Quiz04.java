package quiz01;
import java.util.Scanner;
public class Quiz04 {
	public static void main(String[] args) {
		
		/*
		 * 정수를 하나 입력 받습니다.
		 * 입력받은 값이 0인지, 홀수인지, 짝수인지, 음수인지 구별하는 elseif문
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		int a= scan.nextInt();
		
		
		if(a == 0) {
			System.out.println("0입니다");
		} else if(a < 0) {
			System.out.println("음수입니다");
		} else if(a % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		scan.close();
		
	}

}
