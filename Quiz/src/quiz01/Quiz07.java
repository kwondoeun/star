package quiz01;
import java.util.Scanner;
public class Quiz07 {
	public static void main(String[] args) {
		
//		int i= 1;
//		
//		while (i <= 20) {
//			
//			System.out.println(i + "번 학생의 출석을 체크");
//			i++;
//		}
		/*
		 * 정수를 입력받아서 입력받은 값에 대한 구구단을 출력
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요>");
		int n = scan.nextInt();
		System.out.println("구구단:" + n + "단");
		
		int k = 1;
	
		
		while (k <= 9) {
			
			System.out.println(n+ "x"+ k +"=" + (n*k) );
			//System.out.printf("%d x %d = %d");    --로도 사용가능
			k++;
		}
				
		
		
	}

}
