package fwer;

import java.util.Arrays;

public class Validation {
	public static void main(String[] args) {
	/* 문제1
	 * 주민번호 검증메서드 masking(String)
	 * 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
	 * 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
	 * 
	 * 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
	 * 2. 13자리가 아니거나, 남,여(1,2,3,4) 가 아니라면 throws처리합니다.
	 * 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
	 * 4. 남, 여에 대한 정보를 출력해줍니다.
	 *  
	 * masking메서드를 만들어주세요 
	 * 검증데이터 950101-1000000 -> 남자
	 * 검증데이터 9501012000000 -> 여자
	 * 검증데이터 950101-5000000 -> 예외
	 * 검증데이터 9501015000000 -> 예외
	 * 검증데이터 950101511111 -> 예외
	 */
		
		try {
			System.out.println(masking("950101-1000000")); //확인해보기
			System.out.println(masking("9501012000000"));
		} catch (Exception e) {
			System.out.println("주민번호를 정확히 입력하세요");
			e.printStackTrace();
		}
		
		System.out.println(palindrom("아좋다좋아"));
	}
	 
	
	public static String masking(String name) throws Exception {
		
		name = name.replace("-", "");
		
		if(name.length() != 13) {
			throw new Exception();
		} else {
			switch (name.charAt(6)) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			default:
				throw new Exception(); //1~4가 아닌 다른값
			}
		
		}
		return name.substring(0, 6) + "-" + "*".repeat(7); //중요
		
	}
	

	

	 /* 문제2
		1. String palindromeCheck(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
		2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
		3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
		4. 문장은 공백을 포함하여 받을 수 있습니다.
		5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
		6. 힌트)
		* 함수를 이용하여 공백을 제거하세요. 힌트: replace() 
		* 문장의 길이의 중간값을 구하세요. 
		* 첫문장과, 마지막문장을 비교하며 중간으로 이동
		* for문에서 charAt()을 사용해서 반대로 잘라 붙이세요. (or 빌더를 이용 하여 문자를 뒤집어 비교)
	*/
	
	public static String palindrom(String word) {
		String str = word.replace(" ",""); //공백제거
		String[] arr = str.split("");  // 공백제거된 문장을 단어로 배열 나누어담기
		String[] arr2 = new String[arr.length]; //거꾸로 저장할 배열 생성
		String result = ""; // 결과값
		
		//공백제거된 문자열을 거꾸로 저장하는 for문
		for(int i = str.length()-1; i >= 0; i--) {
			arr2[i] = arr[arr.length-i-1];
			// arr2[5]  = arr[0]
			// 4            1
			// 3             2
			// 2             3
			// 1             4 
		}
		//거꾸로 저장된 배열과 정상으로 저장된 배열의 비교
		for(int i = 0; i < str.length(); i++) {
			if(arr[i].equals(arr2[i])) { //만약에 arr의 0번째와 arr2의 0번째가 같은 값이라면 
				//0            0
				//1            1
				//2            2
				
				
				result = "회문입니다";
			}else {
				result = "회문이 아닙니다.";
				break;
			}
		}
		
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
		return result;
	}
	
}
