package java_1024;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 실수 문자열을 입력 받아서 실수로 변경하고 출력하는 프로그램
		System.out.println("실수를 입력하세요>");
		String su = scanner.nextLine();

		try {

			//실수 문자열을 실수로 변경
			Double silsu = Double.parseDouble(su);

			//실수를 문자열로 변환
			String msg = silsu.toString();
			System.out.println(msg);

		} catch(Exception e) {

			System.out.println("변환에 실패");
		}

		scanner.close();

	}

}
