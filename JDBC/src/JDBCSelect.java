import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {

	public static void main(String[] args) {
		
		//select
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
		String uid = "hr"; //계정
		String upw = "hr"; //비밀번호
		
		String sql = "select * from auth order by auth_id desc";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; //select결과를 반환받을 객체
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//conn
			conn = DriverManager.getConnection(url, uid, upw);
			//pstmt
			pstmt = conn.prepareStatement(sql);
			//?값에 대한 처리
			
			//sql 실행(select의 실행)
			rs = pstmt.executeQuery();
			
			while (rs.next()) { //다음 row가 있다면 true
				
				//한 행에 대한 처리(getInt, getString, getDouble, getTimestamp, getDate)
				int auth_id = rs.getInt("auth_id");
				String name = rs.getString("name"); //컬럼명
				String job = rs.getString("job");
				
				System.out.println("번호:"+auth_id+", 이름:"+name+",직업:"+job);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				System.out.println("close에러");
			}
		}

	}

}
