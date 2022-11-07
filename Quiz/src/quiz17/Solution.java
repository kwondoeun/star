package quiz17;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		int[] arr = {0,31,24,10,1,9};
		System.out.println(solution(arr));
	}
	public static int solution(int[] numbers) {
		int answer = 0;
		int[] max = numbers;
		
		Arrays.sort(max);
		
		answer = max[max.length-1] * max[max.length-2];
		return answer;
	}


}
