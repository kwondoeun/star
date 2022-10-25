package quiz01;
import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan= new Scanner(System.in);
		
		System.out.print("이름>");
		String name= scan.next(); //문자열을 입력받고 name 변수에 저장
		
		System.out.print("나이>");
		int age= scan.nextInt(); //정수형을 입력받고 age 변수에 저장
		
		
		System.out.println("입력된이름:" + name);
		System.out.println("입력된이름:" + age);
		
		scan.close(); //스캐너 지원 끝! (단, 닫으면 이후에 Scanner사용 못함)
	}

}
