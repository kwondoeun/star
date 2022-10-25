package quiz01;

public class Quiz08 {
	public static void main(String[] args) {
		
		//1. 1~100까지 정수중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		
		//2. 1~200까지 정수중에서 6의 배수의 합계
		
		//3. 1~100까지 정수중에서 4의 배수이면서, 8의 배수가 아닌수의 개수
		
		//4. 1000의 약수의 개수 (약수는 나누어 떨어지는 )
		
		
		
		//1. 1~100까지 정수중에 3의 배수이거나, 4의 배수일 경우에 가로로 출력
		
		int i= 1;
		while (i <= 100) {
			
			if (i % 3 == 0 || i % 4 == 0) {
				System.out.print(i + " ");
			}
			 i++;
			
		}
		System.out.println();
		
		
		//2. 1~200까지 정수중에서 6의 배수의 합계
		
		int sum= 0;
		int a= 1;
		
		while (a <= 200) {
			if (a % 6 == 0) {
				sum += a;
			}
			a++;
		}
		System.out.println("6배수의 합계:" + sum);
		
		
		//3. 1~100까지 정수중에서 4의 배수이면서, 8의 배수가 아닌수의 개수
		
		int count1= 0;
		int b= 1;
		
		while (b <= 100) {
			
			if (b % 4 == 0 && b % 8 != 0) {
				count1++;
			}
			 b++;	
		}
		System.out.println("4의 배수이면서, 8의 배수가 아닌수의 개수:" +count1);
		
		
		//4.1000의 약수의 개수 (약수는 나누어 떨어지는)
		
		int count2= 0;
		int c= 1;
		
		while (c <= 1000) {
			
			if(1000 % c == 0) {
				count2++;
			}
			c++;
		}
		System.out.println(count2);
		
		
		
	}

}
