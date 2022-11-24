package jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

	//상수
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String UID = "hr";
	public static final String UPW = "hr";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//DAO클래스 선언
		AuthDAO authDAO = new AuthDAO();
		
		while(true) {

			try {
				System.out.println("메뉴선택[1.저장, 2.조회]\n");

				String menu = scan.next();

				switch (menu) {
				case "1":
				case "저장":
					
					System.out.print("이름>");
					String name = scan.next();
					System.out.print("직업>");
					String job = scan.next();
					
					int result = authDAO.insertEx(name, job);
					
					if(result == 1) {
						System.out.println("정상입력되었습니다");
					}else {
						System.out.println("입력오류발생");
					}
					
					break;

				case "2":
					
					ArrayList<AuthVO> list = authDAO.selectEx();
					for(AuthVO vo: list ) {
						System.out.println(vo.toString());
					}

					break;

				default:
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}


	}

}
