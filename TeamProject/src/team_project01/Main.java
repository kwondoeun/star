package team_project01;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	// 상수
		public static final String URL = "jdbc:oracle:thin:@172.30.1.29:1521:xe";
		public static final String UID = "COM02";
		public static final String UPW = "COM02";
		
	public static void main(String[] args) {
		
		ArrayList<AppointmentVO> list;
		AppointmentDAO aoDAO = new AppointmentDAO();
		
		try {
			list = aoDAO.selectEx();
			for(AppointmentVO vo : list) {
				System.out.println(vo.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Scanner scan = new Scanner(System.in);
		HospitalDAO hDAO = new HospitalDAO();
		boolean bool = true;
		while(bool) {

			try {
				System.out.println("메뉴선택[1.등록, 2.조회]\n");

				String menu = scan.next();

				switch (menu) {
				case "1":
				case "등록":
					
					System.out.println("병원 사업자 번호>");
					int h_no = scan.nextInt();
					scan.nextLine();
					System.out.println("병원이름>");
					String h_name = scan.nextLine();
					System.out.println("병원주소>");
					String h_addr = scan.nextLine();
					System.out.println("병원 전화번호>");
					String h_contact = scan.nextLine();
					
					
					int result = hDAO.insertEx(h_no, h_name, h_addr, h_contact);
					
					if(result == 1) {
						System.out.println("정상입력되었습니다");
					}else {
						System.out.println("입력오류발생");
					}
					
					break;

				case "2":
					
					ArrayList<HospitalVO> list2 = hDAO.selectEx();
					for(HospitalVO vo: list2 ) {
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
