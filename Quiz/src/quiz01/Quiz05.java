package quiz01;
import java.util.Scanner;
public class Quiz05 {
	public static void main(String[] args) {
		
		/*
		 * 정수 3개를 각각 입력을 받습니다.
		 * 같은 정수는 없다고 가정을 합니다.
		 * 
		 * 가장큰값, 중간값, 가장 작은값을 구분해서 출력.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		if (a > b && a > c) {
			max = a;
			if(b > c) {
				mid = b;
				min = c;
			}else {
				mid = c;
				min = b;
			}
		}else if (b > a && b > c) {
			max = b;
			if (a > c) {
				mid = a;
				min = c;
			} else {
				min = c;
				min = a;
			}
		}else if (c > a && c > b){
			if(a > b) {
				mid = a;
				min = b;
			} else {
				mid = b;
				min = a;
			}
		}
		//출력
		System.out.println("max:" + max);
		System.out.println("mid:" + mid);
		System.out.println("min:" + min);

	}

}
