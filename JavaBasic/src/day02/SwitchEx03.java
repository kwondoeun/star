package day02;

public class SwitchEx03 {
	public static void main(String[] args) {

		String[] arr = {"안녕", "hello", "사요나라", "@#$"};
		
		//System.out.println(arr[0]);
		/*
		 * Math.random()을 사용해서 배열의 인덱스 범위(0~3)까지 랜덤수를 만듬
		 * 랜덤수를 배열의 index의 적용해서 출력된 단어가 한국어, 영어, 일본어, 알수없는 언어인지 처리를 해보세요.
		 * 
		 */
		int num= (int)(Math.random()* 4);
		
		System.out.println("선택된단어:" +arr[num]);
		
		//정수 또는 문자여야 함.
		switch (num) {
		case 0:
			System.out.println("한국어");
			break;
		case 1:
			System.out.println("영어");
			break;
		case 2:
			System.out.println("일본어");
			break;

		default:
			System.out.println("알수 없는 언어");
			break;
		}
		
		
	}

}
