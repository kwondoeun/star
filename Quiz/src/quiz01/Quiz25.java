package quiz01;
import java.util.Arrays;

public class Quiz25 {
	public static void main(String[] args) {
		
		char[] arr = {'a','b','c'};
		String result = method06(arr); //변수명
		System.out.println(result);
		
		int[] arr2 = {1,2,3};
		int result2 = method07(arr2);
		System.out.println(result2);
		
		String[] arr3 = method08("홍길동","이순신");
		System.out.println(Arrays.toString(arr3));
	}
	//반환 String, 매개 변수char[] - char 배열의 요소를 문자열로 모두 붙여서 리턴
	static String method06(char[] arr) {
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}
	//반환 int, 매개 변수int[] - 배열 요소의 합을 리턴
	static int method07(int[] arr) {
		int sum = 0;
		for (int a : arr) { //향상된 for문
			sum += a;
		}
		return sum;
	}
	//반환 String[], 매개변수 String,String - 매개 변수를 배열에 저장하여 배열 리턴
	static String[] method08(String a, String b) {
		String[] arr = {a,b};
		return arr;
	}
	
}
