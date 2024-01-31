package kr.s08.memo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;
/*
 * DAO : Data Access Object
 * 	 	데이터베이스의 데이터를 전문적으로 호출하고 제어하는 객체 
 */
public class MemoDAO {
	//글쓰기
	public void insertMemo(String name,String passwd, 
						   String subject, String content,
						   String email) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();

			//SQL문 작성
			sql = "INSERT INTO memo (num,name,passwd,subject,content,email,reg_date)"
					+"VALUES (memo_seq.nextval,?,?,?,?,?,SYSDATE)";
			//memo_seq.nextval은 시퀀스를 호출한다. /nextval은 시퀀스의 명령어. 다음 시퀀스를 읽어온다.		
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, name);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);
			pstmt.setString(5, email);
			
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삽입했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	//목록 보기
	public void selectMemo() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;  //행 데이터를 읽어와서 rs에 보관
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM memo ORDER BY num DESC ";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt = conn.prepareStatement(sql);
			System.out.println("---------------------------------------");
			
			//JDBC 수행 4단계 : SQL문을 실행해서 결과행들을 ResultSet에 담음
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("글번호\t이름\t작성일\t\t제목");
				do {
					System.out.print(rs.getInt("num")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getDate("reg_date")+"\t");
					System.out.println(rs.getString("subject"));
				}while(rs.next());
			}else {
				System.out.println("등록된 데이터가 없습니다.");
			}
			System.out.println("---------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//상세글 보기
	public void selectDetailMemo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;   //데이터를 읽어오는거니까 ResultSet에 담아야한다.
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn=DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM memo WHERE num=?";
			//JDBC 수행 3단계
			pstmt= conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			//JDBC 수행 4단계 : SQL문을 실행해서 한 건의 레코드를 ResultSet에 담음
			rs = pstmt.executeQuery();
			
			if(rs.next()) {//한건의 행에 접근      //컬럼명은 문자열 num 
				System.out.println("글번호 : " + rs.getInt("num"));
				System.out.println("이름 : " + rs.getString("name"));
				System.out.println("비밀번호 : " + rs.getString("passwd"));
				System.out.println("제목 : " + rs.getString("subject"));
				System.out.println("내용 : " + rs.getString("content"));
				//사용자는 null이라고 출력되면 무슨뜻인지 모르니까 조건 체크로 비어있게 한다.
				String email = rs.getString("email");
				if(email==null) email = "";
				System.out.println("이메일 : " + email);
				System.out.println("작성일 : " + rs.getDate("reg_date"));
			}else {
				System.out.println("검색한 정보가 없습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//글 수정    (name,passwd,subject,content,email만 수정한다)
	public void updateMemo(int num,String name,String passwd, 
			   			String subject, String content,String email) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			String sql = null;
			
			try {
				//JDBC 수행 1,2단계
				conn=DBUtil.getConnection();
				//SQL문 작성
				sql = "UPDATE memo SET name=?,passwd=?,subject=?,content=?,"
						+"email=? WHERE num =?";
				//JDBC 수행 3단계 : PreparedStatement 객체 생성
				pstmt= conn.prepareStatement(sql);
				//?에 데이터 바인딩
				pstmt.setString(1, name);
				pstmt.setString(2, passwd);
				pstmt.setString(3, subject);
				pstmt.setString(4, content);
				pstmt.setString(5, email);
				pstmt.setInt(6, num);
				
				//JDBC 수행 4단계 : SQL문을 실행
				int count = pstmt.executeUpdate();
				System.out.println(count + "개의 행을 수정했습니댜.");
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				//자원 정리
				DBUtil.executeClose(null, pstmt, conn); 
			}
	}
	//글 삭제
	public void deleteMemo(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn=DBUtil.getConnection();
			//SQL문 작성
			sql = "DELETE FROM memo WHERE num =?";
			//JDBC 수행 3단계 : PreparedStatement 객체 생성
			pstmt= conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, num);
			
			//JDBC 수행 4단계 : SQL문을 실행
			int count = pstmt.executeUpdate();
			System.out.println(count + "개의 행을 삭제했습니댜.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//자원 정리
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}
