package quiz01;
public class Bak {
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(solution(arr));
		
	}
	static double solution(int[] arr) {
		double sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum /= arr.length;
		return sum;
	}
	
}