package day03;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		
		//정렬 -> 선택정렬, 퀵정렬
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
//		for(int i = 0; i < arr.length -1; i++) {
//			
//			for(int j = i + 1; j < arr.length; j++) {
//				
//				if(arr[i] > arr[j]) { //>를 <로 바꾸어주면 내림차순으로 출력할수 있음
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//				
//			}
//		}
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int x = 10; //temp로 순서 바꾸는 방식
		int y = 20;
		
		int temp = x;
		x = y;
		y = temp;
		
		
	}

}
