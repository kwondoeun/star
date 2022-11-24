package team_project01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class PetInsert {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//insert
		String url = "jdbc:oracle:thin:@172.30.1.26:1521:xe"; //주소
		String uid = "COM02"; //계정
		String upw = "COM02"; //비밀번호

		String sql = "insert into PET values(?,?,?)";

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//connection
			conn = DriverManager.getConnection(url, uid, upw);

			//statement객체
			pstmt = conn.prepareStatement(sql); //객체 타입 반환 (함수 호출, 반환)
			
			
			while(true) {
				System.out.println("동물번호>");	
				int pNum = scan.nextInt();
				scan.nextLine();
				System.out.println("동물종류>");
				String pType = scan.nextLine();
				System.out.println("USER_ID>");
				String pUserId = scan.nextLine();
				
				if(pNum == 0) {
					break;
				}
				pstmt.setInt(1, pNum);
				pstmt.setString(2, pType);
				pstmt.setString(3, pUserId);
				
				//4. sql실행 (select문은 query문장 실행, i , d, u 문은 update 메서드로 실행)
				int result = pstmt.executeUpdate(); //매개변수가 없어야 함, 성공 실패 결과를 반환함
				
				if(result == 1) {
					System.out.println("성공");
				}else {
					System.out.println("실패");
				}
			}

			//3. ?값 세팅 - 첫번째부터 1번 순서 (setString, setInt, setDate, setTimestmp)

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				conn.close();
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("close에러");
			}
		}

	}

}
