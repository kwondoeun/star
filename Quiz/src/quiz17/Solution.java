package quiz17;

import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		String[] solution = {"aya", "yee", "u", "maa", "wyeoo"};
		System.out.println(solution);


	}
	public static int solution(String[] babbling) {
		int answer = 0;
		
		String[] no = {"ayaaya", "yeye", "woowoo" , "mama"};
		String[] yes = {"aya", "ye", "woo", "ma"};
		
		for(String str : babbling) {
			String chk = str;
			for(String nope : no) {
				chk = chk.replace(nope, "X");
			}
			for(String yeah : yes) {
				chk = chk.replace(yeah, "");
			}
			if(chk.length() == 0) {
				answer++;
			}
		}
		
		return answer; 
		
	}




}
