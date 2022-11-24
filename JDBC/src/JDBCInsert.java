import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsert {

	public static void main(String[] args) {
		
		//insert
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
		String uid = "hr"; //계정
		String upw = "hr"; //비밀번호
		
		String sql = "insert into auth values(seq_auth.nextval, ?,?)";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//connection
			conn = DriverManager.getConnection(url, uid, upw);
			
			//statement객체
			pstmt = conn.prepareStatement(sql); //객체 타입 반환 (함수 호출, 반환)
			
			//3. ?값 세팅 - 첫번째부터 1번 순서 (setString, setInt, setDate, setTimestmp)
			pstmt.setString(1, "홍길동");
			pstmt.setString(2, "프로그래머");
			
			//4. sql실행 (select문은 query문장 실행, i , d, u 문은 update 메서드로 실행)
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
