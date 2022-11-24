package jdbc.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelect2 {

	public static void main(String[] args) {
		
		/*
		 * 사원수를 입력 받습니다.
		 * 
		 * employees, departments테이블에서 부서별 사원수가 입력받은 사원수 보다 큰 데이터를 select
		 * 
		 * 출력할 컬럼은 부서명, 사원수, 부서아이디
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원수>");
		int num = sc.nextInt();
		
		//select 변수선언
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //주소
		String uid = "hr"; //계정
		String upw = "hr"; //비밀번호
		
		String sql = "select * from (select d.department_name, d.department_id, \r\n"
				+ "    (select count(*) from employees e where e.department_id = d.department_id) cou\r\n"
				+ "from departments d) a\r\n"
				+ "where a.cou >= ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//드라이버로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//conn
			conn = DriverManager.getConnection(url, uid, upw);
			//pstmt
			pstmt = conn.prepareStatement(sql);
			//값세팅
			pstmt.setInt(1, num);
			
			//sql 실행(select의 실행)
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String department_name = rs.getString("department_name");
				int cou = rs.getInt("cou");
				int department_id = rs.getInt("department_id");

				System.out.println("부서이름>" +department_name +" "+ "사원수:"+ cou +" "+ "부서ID>" +department_id);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
				System.out.println("close에러");
			}
		}

	}

}
