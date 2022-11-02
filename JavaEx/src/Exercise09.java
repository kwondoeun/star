import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;		
		Scanner sc = new Scanner(System.in);

		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if(selectNo == 1) {
				System.out.println("학생수>");
				studentNum = sc.nextInt();
			}else if(selectNo == 2) {
				scores = new int[studentNum];
				//System.out.println(Arrays.toString(scores));
				for(int i = 0; i < scores.length; i++) {
					scores[i] = sc.nextInt();
					//System.out.println(Arrays.toString(scores));
				}
			}else if(selectNo == 3) {
				System.out.println(Arrays.toString(scores));
			}else if(selectNo == 4) {
				Arrays.sort(scores);
				System.out.println(Arrays.toString(scores));
				System.out.println("최고점수: " + scores[studentNum-1]);
				
				double sum = 0;
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				System.out.println("평균점수: " + sum/studentNum);
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
