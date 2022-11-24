package team_project01;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMarkListMain {
	// 상수
	public static final String URL = "jdbc:oracle:thin:@172.30.1.29:1521:xe";
	public static final String UID = "COM02";
	public static final String UPW = "COM02";

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BookMark_ListDAO bDAO = new BookMark_ListDAO();
		
		boolean bool = true;
		
		while(bool) {

			try {
				System.out.println("메뉴 선택[1.등록, 2.조회]\n");

				String menu = scan.next();
				scan.nextLine();
				

				switch (menu) {
				case "1":
				case "등록":
					
					System.out.println("즐겨찾기 번호>");
					String b_no = scan.nextLine();
					
					System.out.println("병원번호>");
					int h_no = scan.nextInt();
					scan.nextLine();
					System.out.println("USER_ID>");
					String pu_id = scan.nextLine();
					
					int result = bDAO.insertEx(b_no, h_no, pu_id);
					
					if(result == 1) {
						System.out.println("정상입력되었습니다");
					}else {
						System.out.println("입력오류발생");
					}
					
					break;

				case "2":
					
					ArrayList<BookMark_ListVO> list2 = bDAO.selectEx();
					for(BookMark_ListVO vo: list2 ) {
						System.out.println(vo.toString());
					}

					break;

				default:
					bool = false;
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
