package fwer;
import java.util.Arrays;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		//부족한 숫자
		//숫자로 구성된 길이가 정확히 9인 문자열 S가 주어진다. 0부터 9까지의 모든 숫자가 S에 정확히 한 번 나타난다.
		//S에서 누락된 유일한 숫자를 인쇄하라.
		Scanner sc = new Scanner(System.in);
		
		//023456789
		// int x1 = Integer.parseInt (row1.split(" ")[0]);
		
		String s = sc.nextLine(); //엔터키값을 기준으로 나누어줌
		String[] arr = s.split("");
		int sum = 0;
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
//		System.out.println(sum);
		
		int result = 45-sum;
		
		System.out.println(result);
		
		//문자열을 정수형으로 바꿔 각 자리수를 다 더한 뒤 45에서 뺀값이 정답
//		int n = Integer.parseInt(s);
//		System.out.println(n);
//		int answer = 0;
//		
//		while(n > 0) {
//			answer += n % 10;
//			n /= 10;
//		}
//		answer = 45 - answer;
//		System.out.println(answer);
		
	}

}
