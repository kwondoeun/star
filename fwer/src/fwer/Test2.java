package fwer;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		//어느 날, 다카하시가 정확히 A시 B분(24시간제)에 일어났고, 아오키는 정확히 C시 D분 1초에 일어났다.
		//다카하시가 아오키보다 일찍 일어나면 Takahashi를 인쇄하고, 그렇지 않으면 Aoki를 인쇄하라.

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();//문자열
		String[] arr = s.split(" ");
		//		System.out.println(Arrays.toString(arr));
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		int d = Integer.parseInt(arr[3]);
		
		if(a > c) { // 아오키가 시간단위로 더 일찍 일어남
			System.out.println("Aoki");
		} else if(a < c) { // 타카하시가 시간단위로 더 일찍 일어남
			System.out.println("Takahashi");
			
		} else { // 둘이 같은 시에 일어남
			if(b > d) {
				System.out.println("Aoki");
			} else {// b < d , b == d
				System.out.println("Takahashi");
			}
		}

	}

}
