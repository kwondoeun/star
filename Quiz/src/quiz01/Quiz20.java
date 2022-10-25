package quiz01;
import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		/*
		 * ABC - > 한글자씩 char 배열에 저장 
		 */
		String str = "ABC";
		
//		System.out.println(str.charAt(0)); //charAt() - String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
		
		//1st
//		char[] arr = new char[str.length()];
//		
//		for(int i = 0; i < str.length(); i++) {
//			arr[i] = str.charAt(i);
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		//2nd
//		char[] arr = "ABC".toCharArray(); //toCharArray() - 문자열을 char형 배열로 바꾸어줌
//		System.out.println(Arrays.toString(arr)); //배열의 내용을 출력하기 위해 Arrays.toString()사용

		
		/*
		 * 첫번째 입력받은 값을 한글자씩 char형으로 출력
		 * ABC -> A B C
		 * A -> A
		 * AAA -> A A A
		 */
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+ " ");
//		}
		
		/*
		 * 두 문자열을 입력받습니다.
		 * 첫 입력에 알파벳이 주어집니다.
		 * 두번째 입력에는 알파벳으로 만들어진 문자열이 주어집니다
		 * -> B
		 * -> SDDFDFBBBSRRG(B가 3개)
		 * 
		 * 첫번째 입력된 알파벳이 두번째 입력에 몇개 포함되어 있는지 출력
		 * 
		 */
		
		//문자열 다루기 -> 문자열, 문자는 다름(둘 다 바꾸어서 처리) 
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		char c = a.charAt(0);
		
		int count = 0;
		for(int i = 0; i < b.length(); i++) {
			
			if(b.charAt(i) == c) { //b가입력된 문장을 한글자씩 나눠서 c첫번째 글자와 같다면 count를 올린다.
				count++;
			}
		}	
		System.out.println(count);
		

	}

}
