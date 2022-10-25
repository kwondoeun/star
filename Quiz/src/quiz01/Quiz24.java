package quiz01;

public class Quiz24 {
	public static void main(String[] args) {
		
		//자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수를 완성하세요. //입력이란것은 매개변수가 들어온다는 의미
//		int num = sum(5);
//		System.out.println(num);
		System.out.println(sum(5));
	}
	static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum; //for문 밖에서 선언
	}

	
	
}
