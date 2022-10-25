package quiz01;

public class Quiz14 {
	public static void main(String[] args) {
		
		//2단~9단까지 구구단을 세로로 출력.
		
		for(int i = 2; i <= 9; i++ ) {
			System.out.println(i + "단");
			
			for(int k = 1; k <= 9; k++) {
				System.out.println(i + "X" + k + "=" +(i *k));
			  //System.out.printf("%d x %d = %d\n", i, k, i*k); 이러한 방식으로도 가능
				
			}
			
			System.out.println("----------");
		}
		
		
		
	}

}




