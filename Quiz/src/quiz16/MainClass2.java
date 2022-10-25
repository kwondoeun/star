package quiz16;
import java.util.Scanner;
public class MainClass2 {
	public static void main(String[] args) {
		/*
		 * up down게임
		 * 
		 * 1~100까지의 임의 숫자를 1번 생성
		 * 반복문안에서 스캐너를 이용해서 정답을 입력받습니다.
		 * 
		 * 랜덤수가 입력받은 값보다 작으면 "더 큰 수를 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면 "더 작은 수를 입력하세요"
		 * 
		 * 정답이라면 시도횟수: x회 를 출력하고 종료
		 * 
		 * 만약에 숫자가 아닌값이 들어온다면 예외를 처리하고, 다시 입력받으세요
		 */

		Scanner scan = new Scanner(System.in);

		int ran =(int)(Math.random()*100)+1; //정답
		int sum= 0;

		while(true) {
			try {
				System.out.println("정답입력>");
				int answer = scan.nextInt();
				sum++;

				if(answer == ran) {
					System.out.println("정답");
					System.out.println("시도횟수:" +sum);
					break;
				}else if(answer < ran) {
					System.out.println("더 큰수를 입력하세요");
				}else if(answer > ran) {
					System.out.println(" 더 작은수를 입력하세요");
				}

			} catch (Exception e) {
				System.out.println("숫자로 입력하세요");
				scan.nextLine();
				sum++;
			}

		}
	}
}
