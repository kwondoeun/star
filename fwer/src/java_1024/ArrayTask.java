package java_1024;
import java.util.Arrays;

public class ArrayTask {
	public static void main(String[] args) {
		//문자열 배열 생성
		String[] ar = {"카리나", "아이린", "윈터", "조이", "슬기"};
		
		//배열을 순회하면서 출력
		/*
		for(String singer : ar) {
			System.out.println(singer);
		}
		*/
		
		//문자열의 크기 비교하는 메서드: compareTo, compareToIgncorecase
		//System.out.println(ar[0].compareTo(ar[1])); //앞에것이 더 크면 양수
		//System.out.println(ar[1].compareTo(ar[0])); //뒤어것이 더 크면 음수
		
		//선택 정렬
		//1. 배열의 복제
		String[] copyAr = Arrays.copyOf(ar, ar.length);
		
		//선택 정렬
		//첫번째부터 n-1 번째 데이터 까지
		for(int i = 0; i < copyAr.length-1; i++) {
			//자신의 뒤에 있는 모든 데이터와 비교해서
			for(int j = i+1; j < copyAr.length; j++) {
				//뒤에 있는 데이터가 더 크다면 교환 (부등호만 바꾸면 오름차순 내림차순)
				if(copyAr[i].compareTo(copyAr[j]) < 0) {
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp; 
				}
			}
		}
		
		System.out.println(Arrays.toString(copyAr));

	}

}
