package day02;

public class ContinueEx01 {
	public static void main(String[] args) {
		
//		for(int i= 1; i <= 10; i++) {
//			
//			if(i % 2 == 1) { //홀수는 빼고
//				continue; //다음 반복으로 pass
//			}
//			System.out.println(i);
//			
//		}
		
		int i = 1;
		while(i <= 10) {
						
			if (i % 2 == 1) {
				i++;
				continue;
				//return; //메인의 종료
			}
			
			System.out.println(i);
			i++;
		}
		
		System.out.println("프로그램 정상 종료");
		
	}

}
