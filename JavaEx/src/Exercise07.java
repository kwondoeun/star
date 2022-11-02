import java.util.Scanner;
public class Exercise07 {
	public static void main(String[] args) {
		
		boolean run = true;
		
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------");
			System.out.println("선택> ");
			
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("예금액> ");
				balance += sc.nextInt();
			}else if(num == 2) {
				System.out.println("출금액> ");
				int num2 = sc.nextInt();
				if(balance < num2) {
					System.out.println("잔고가 부족합니다.");
				}else {
					balance -= num2;					
				}
			}else if(num == 3) {
				System.out.println("잔고> " + balance);
				if(balance < 0) {
					System.out.println("0원");
				}
			}else if(num == 4) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
