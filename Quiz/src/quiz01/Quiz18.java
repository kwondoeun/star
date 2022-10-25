package quiz01;
import java.util.*;
public class Quiz18 {
	public static void main(String[] args) {
		/*
		 * 랜덤한 덧셈 문제를 내는 프로그램
		 * 
		 * 반복이 실행될때마다 1~100사이의 랜덤한 덧셈 구문이 출력됩니다.
		 * 0을 입력받으면 프로그램을 종료합니다.
		 * 프로그램이 종료되면 정답횟수, 오답횟수를 출력하면 됩니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		int count = 0; //정답카운트
		int count1 = 0; // 오답카운트
		
		while (true) {
			
			int ran = (int)(Math.random()*100)+1;
			int ran2 = (int)(Math.random()*100)+1;
			
			System.out.println(ran + "+" + ran2 + "=" + "?");
			System.out.println("문제를 그만 푸시려면 0을 입력하세요.");
			System.out.println("정답>");
			int answer = scan.nextInt();
			
			if(answer == 0) {
				break;
			} else if(answer == ran+ran2) {
				System.out.println("정답입니다");
				count++;
			} else if(answer != ran+ran2) {
				System.out.println("틀렸습니다");
				count1++;
			} 
		}
		System.out.println("프로그램 정상종료");
		System.out.println("정답:"+count);
		System.out.println("오답:"+count1);
			
		
	}

}
