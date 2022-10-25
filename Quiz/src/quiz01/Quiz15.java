package quiz01;

public class Quiz15 {
	public static void main(String[] args) {
		
		//힌트 -> 출력은 가로 or 세로로만 가능함
		//정렬은 \t ->8칸 띄어쓰기
		
		for(int i = 1; i <= 9; i+=3) {
						
			for(int k = 1; k <= 9; k++) {

				System.out.print(i + "X" + k + "=" + i*k + "\t");
				System.out.print(i+1 + "X" + k + "=" + (i+1)*k+ "\t");
				System.out.print(i+2 + "X" + k + "=" + (i+2)*k);
				
				System.out.println(); //줄바꿈
				
			}
			System.out.println(); //줄바꿈
		}
		
		
		
		
	}

}
