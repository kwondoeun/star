package quiz15;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//바깥에 객체생성
		SongList m = new MelonMusic(); //new BugsMusic이면 벅스뮤직 실행가능
		
		while(true) {
			System.out.println("메뉴[1.추가, 2.재생, 3.개수, 4.종료]");
			System.out.println(">");

			int num = scan.nextInt();

			if(num == 1 ) {
				System.out.println("노래>");
				String name = scan.next();
				m.insertList(name);
			}else if(num == 2) {
				m.playLength();
			}else if(num == 3) {
				int len = m.playLength();
				System.out.println("재생곡개수:"+ len);
			}else if(num == 4) {
				System.out.println("종료");
				return;
			}
			
		}

	}

}
