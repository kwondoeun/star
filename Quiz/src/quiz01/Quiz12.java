package quiz01;
import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		
		//1. 7~100까지 정수중의 7의 배수를 가로로 출력
		
		for(int a=1; a <= 100; a++) {          //for(int a =7; a <= 100; a+=7) {System.out.println(a +" ");}
			
			if(a % 7 == 0) {
				
			System.out.print(a+ " ");
				
			}
			
		}
		System.out.println();
		
		
		
		//2. 1~200까지 정수중의 9의 배수의 개수를 출력
		
		int count= 0;
		for(int b=1; b <= 200; b++) {
			
			if(b % 9 == 0) {
				
				count++;
				
			}
			
		}
		
		System.out.println("9의 배수의 개수:" + count);
		
		
		
		
		//3. 50~100까지 두수 사이의 합

		int sum2 = 0;
		for(int c= 50; c <= 100; c++) {
			
			sum2+=c;
		}
		System.out.println(sum2);
		
		
		
		
		//4. char변수를 활용해서 A~Z까지 출력, A= 65, z=90
			
		for(char d= 65; d <= 90; d++) {      //for(char d='A'; d <= 'Z'; d++)
			
			System.out.println(d);
		}
		
		
		
		
		
		//5. 어떤수를 입력받아서 입력받은 수의 구구단 출력.
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요>");
		int k= scan.nextInt();
		
		for(int e=1; e <= 9; e++) {
			System.out.println(k + "*" + e + "=" +(k*e));
		}
		
		
		
	}

}
