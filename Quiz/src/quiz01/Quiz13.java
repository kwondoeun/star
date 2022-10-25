package quiz01;
import java.util.Arrays;

public class Quiz13 {
	public static void main(String[] args) {
		
		//절대 중복되지 않는 3개의 숫자를 뽑기
		/*
		 * 배열을 랜덤하게 15번정도 섞는다.
		 * 0~2번째 인덱스값을 새로운 배열에 옮겨 담는다.
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; 
		
		for(int i = 0; i < arr.length; i++) {
			
			int ran = (int)(Math.random() * arr.length); //0~14
			
			//System.out.println(arr[i]+ "-" + arr[ran]);
			
			int temp = arr[i];
			arr[i] = arr[ran];
			arr[ran] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] newArr= new int[3];
		for(int i = 0; i < newArr.length; i++) {
			
			newArr[i] = arr[i];  //새로운 배열에 담는다.
			
		}
		System.out.println(Arrays.toString(newArr));
		
	}

}


