package quiz01;
import java.util.Scanner;
public class Quiz09 {
	public static void main(String[] args) {
		
		//두 수를 입력받는다.
		//두 수 사이의 합을 구하세요
		
		//숙제
		//1. 큰수 작은수 비교
		//2. 작은수 ~ 큰수 반복
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int max = a > b ? a : b;    //항상 큰수     .. 참이면 a값 넣음 거짓이면 뒤에값인 b넣음
		int min = a > b ? b : a;    //항상 작은수
		
		int sum = 0;
		
		while (min <= max) {
			sum += min;
			min++;
		}
		System.out.println(sum);
		

	}

}
