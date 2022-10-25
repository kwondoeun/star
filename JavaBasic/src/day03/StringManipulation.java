package day03;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {
		
		//문자열 다루기
		//String str = new String(new char[] {'A', 'B', 'C'});
		//System.out.println(str);
		
		String str = "안녕하세요~";
		
		//문자열의 길이를 확인
		//System.out.println(str.length());
		int len = str.length();
		System.out.println(len);
		
		//문자열을 한글자 자르기
		char c = str.charAt(5); //str.charAt(0);
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf, lastIndexOf - 찾는 문자의 위치 반환
		
		int a = str.indexOf("녕");
		System.out.println("찾은 위치:" +a);
		
		int b = str.lastIndexOf("녕");
		System.out.println("찾은위치:" +b);
		
		int d = str.indexOf("sdf");
		System.out.println("찾는 문자가 없다면:" +d); //-1
		
		//문자열 변경 - replace
		//str.replace("찾을문자","변경할문자");
		String e = str.replace("안","헐"); //안 -> 헐 (전부다)
		System.out.println(e);
		System.out.println(str);  //replace의 특징 새로운결과를 돌려줄뿐 원본문자는 그대로 유지
		
		//대소문자 변경 toUpperCase, toLowerCase
		str = "abcDeFg";   //원본 str유지
		String f= str.toUpperCase();
		System.out.println(f);
		
		//공백제거 trim or replace
		str = "   010-1234-5678   ";
		String g = str.trim();
		System.out.println(g);  //앞뒤 공백제거
		System.out.println(str);
		
		str = "  안 녕 하 세 요 개 천 절 날 은 쉽니다   ";
		String h = str.trim();
		System.out.println(h); //앞뒤 공백제거
		
		String i = str.replace(" ","");
		System.out.println(i); //모든 공백제거
		
		//String.valueOf() -> 기본타입을 문자로 변경
		System.out.println(String.valueOf(10)+20);
		
		//문자열 자르기 ★
		//substring - 인덱스 기준으로 자름
		//split - 특정문자 기준으로 잘라서 배열로 담아줌
		//toCharArray
		str = "010-1234-5678";
		
		String j = str.substring(3); //인덱스 미만 절삭
		System.out.println(j);
		
		String k = str.substring(3,5); //인덱스 이상 ~ 인덱스 미만 추출
		System.out.println(k);
		
		String[] arr = str.split("-"); //str.split("");
		System.out.println(Arrays.toString(arr));
		
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));

	}

}
