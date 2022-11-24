package jdbc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AuthDAO {

	//멤버변수
	private String url = MainClass.URL; //주소
	private String uid = MainClass.UID; //계정
	private String upw = MainClass.UPW; //비밀번호

	//메서드화
	public int insertEx(String name, String job) {

		int result = 0;

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
			pstmt.setString(1, name);
			pstmt.setString(2, job);

			//4. sql실행 (select문은 query문장 실행, i , d, u 문은 update 메서드로 실행)
			result = pstmt.executeUpdate(); //매개변수가 없어야 함, 성공 실패 결과를 반환함

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


		return result;
	}

	//조회메서드 ->한 행일때는 VO만 가능, 여러 행일때는 ArrayList<AuthVO>
	public ArrayList<AuthVO> selectEx() {
		
		ArrayList<AuthVO> list = new ArrayList<>();
		
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
				
				//vo에 행 데이터 저장
				//vo를 list에 저장
				AuthVO vo = new AuthVO(auth_id, name, job);
				list.add(vo);
				
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

		
		return list;
		
	}
	
}
