package day02;

public class MultiForEx02 {
	public static void main(String[] args) {
		
		//회전할때마다 횟수가 변하는 중첩반복문
		/*
		 *       *
		 *      ***
		 *     *****
		 *    *******
		 *   *********
		 * 
		 */
		int star = 5;  //변수를 쓰는 이유: 값을 바꾸어주면 규칙에 맞게끔 프린트
		for(int i = 1; i <= star; i++) {
			//공백
			for(int j = 1; j <= star-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		System.out.println("-----------------------------");
		/*               i  공백j  별j
		 *  *********    1   0    9
		 *   *******     2   1    7
		 *    *****      3   2    5
		 *     ***       4   3    3
		 *      *        5   4    1
		 */
		
		for(int i = 1; i <= star; i++) {
			
			for(int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*(star-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
