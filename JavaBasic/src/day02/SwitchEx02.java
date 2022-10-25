package day02;
import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		//IfEx02와 동일하게 실행되도록 switch문으로 변경
		//90~99까지는 9
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수>");		
		int point = scan.nextInt();
		
		switch (point/10) {
		case 9:
			System.out.println("A");
			break;
			
		case 8:
			System.out.println("B");
			break;
			
		case 7:
			System.out.println("C");
			break;
			
		case 6:
			System.out.println("D");
			break;

		default:
			System.out.println("F");
			break;
		}
		
			
		
		
	}

}


