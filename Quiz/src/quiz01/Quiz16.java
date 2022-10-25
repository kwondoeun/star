package quiz01;
import java.util.Scanner;
public class Quiz16 {
	public static void main(String[] args) {	
		/*
		 * 정수형태로 입력을 2개 받습니다.
		 * 첫번째=가로길이, 두번째=세로길이
		 * 
		 * 입력받은 가로, 세로 길이의 사각형을 출력하면 됨
		 * 단, 윤곽만 출력
		 * 
		 * 힌트-> 1행, 마지막행, 1열, 마지막 열만 출력, 공백도 문자임
		 */		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로>");
		int w= scan.nextInt();
		
		System.out.println("세로>");
		int h= scan.nextInt();
		
			
		for(int i= 1; i <= h; i++) {  //세로(행)   
			
			for(int j = 1; j <= w; j++) {  //가로(열)
				
				if(i == 1 || i == h || j == 1 || j == w) { //1행, 마지막행, 1열, 마지막열
					
					System.out.print("*");
					
				}else {
					
					System.out.print(" ");
				}
					
			}
			
			System.out.println();
			
		}
			
		
	}

}
