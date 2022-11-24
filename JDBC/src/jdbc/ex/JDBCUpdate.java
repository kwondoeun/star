package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUpdate {

	public static void main(String[] args) {

		//스캐너로 auth_id, name, job을 입력받아서 해당auth_id의 name, job을 업데이트하는 구문.
		Scanner sc = new Scanner(System.in);
		
		String updateName = sc.next();
		String updateJob = sc.next();
		int updateAuth_id = sc.nextInt(); //int로도 가능

		//update 변수 선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
		String uid = "hr"; //계정
		String upw = "hr"; //비밀번호

		String sql = "UPDATE auth SET name = ?, job = ? WHERE auth_id = ?";


		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connection
			conn = DriverManager.getConnection(url, uid, upw);
			
			//statement객체
			pstmt = conn.prepareStatement(sql); //객체 타입 반환 (함수 호출, 반환)
			
			//3. ?값 세팅 - 첫번째부터 1번 순서 (setString, setInt, setDate, setTimestmp)
			pstmt.setString(1, updateName); //str
			pstmt.setString(2, updateJob); //str
			pstmt.setInt(3, updateAuth_id); //number
			
			//4. sql실행 (update 메서드로 실행)
			int result = pstmt.executeUpdate(); //매개변수가 없어야 함, 성공 실패 결과를 반환함
			
			if(result == 1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
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
