package quiz07;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		
		PrintArray p = new PrintArray();
		
		int arr[] = {1,2,3};
		char arr1[] = {'A','B','C'};
		String arr2[] = {"메롱","연휴"};
		
		System.out.println(p.toArray(arr));
		System.out.println(p.toArray(arr1));
		System.out.println(p.toArray(arr2));
		System.out.println(Arrays.toString(arr));

		
	}

	
	
}
