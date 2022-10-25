package day02;
import java.util.Scanner;
public class MultiForEx03 {
	public static void main(String[] args) {
		
		//입력받은 수까지 소수를 출력
		//소수 -> 나누어 떨어지는 수가 1과 자기자신인 수
		//예) 5 -> 2 3 5
		//입력받은 수까지 반복하고, 각 수를 자기 자신까지 나누면서 약수의 개수가 2개인 수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수>");
		int num = scan.nextInt();
		
	
		for(int i = 1; i <= num; i++) {
			
			int count = 0; //카운트 초기값을 0으로
			
			for(int j = 1; j <= i; j++) {
				
				//System.out.println(i + "-" + j);
				if(i % j == 0) {  //j로 일일히 나눔
					count++;
				}
			}//inner for
			
			if(count == 2) { //약수가 2개여야하니
				System.out.println(i);
			}
			
		}
		
	
		
	}

}
