package quiz17;

public class Solution2 {
	
	public void main(String[] args) {
		
		int[] arr = {1,1,2,3,4,5};
		System.out.println(solution(arr,1));
	}
	
	
	public int solution(int[] array, int n) {
		int answer = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i]==n) {
				answer++;
			}
		}
		
		
        return answer;
	}

}
