package kr.s11.book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.util.DBUtil;
/*
 * 순서
1.관리자 도서 등록
2.관리자 도서 목록 보기
3.사용자 회원가입
4.관리자 회원 목록
5.사용자 도서 대출
6.관리자 대출 목록
7.사용자 MY 대출 목록
8.사용자 대출 도서 반납
 */
public class BookDAO {
	
	//관리자 도서 등록 		
	public void adm_insertBook(String bk_name,String bk_category ) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		
		try { 
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO book (bk_num,bk_name,bk_category) "
				+"VALUES (book_seq.nextval,?,?)";
			//JDBC 수행 3단계
			pstmt= conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, bk_name);
			pstmt.setString(2, bk_category);
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "건의 도서 정보를 등록했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null,pstmt, conn);
		}
	}
 	//관리자 도서 목록
	public void adm_selectBook() {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT b.bk_num, bk_category, bk_name, re_status, bk_regdate "
				+" FROM book b LEFT JOIN (SELECT bk_num, MAX(re_num) as last_Renum "
				+"FROM reservation GROUP BY bk_num) tmp ON b.bk_num = tmp.bk_num "
				+"LEFT JOIN reservation r ON tmp.bk_num = r.bk_num AND tmp.last_Renum = r.re_num "
				+"ORDER BY b.bk_num DESC";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("----------------------------------");
				System.out.println("번호\t카테고리\t도서명\t\t대출여부\t등록일");
				System.out.println("----------------------------------");
				do {
					System.out.print(rs.getInt("bk_num")+"\t");
					
					System.out.print(rs.getString("bk_category")+"\t");
					System.out.print(rs.getString("bk_name")+"\t\t");
					//System.out.print(rs.getInt("re_status")+"\t");
					
					if(rs.getInt("re_status")==0) {
						System.out.print("대출가능\t");
						
					}else {
						System.out.print("대출중\t");
					}
					
					System.out.println(rs.getDate("bk_regdate"));
				}while(rs.next());
			}else {
				System.out.println("등록된 도서가 없습니다.");
			}
			System.out.println("----------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//관리자 도서 삭제 가능 여부 1) 대출중인 도서가 있을때!!(내가 넣음)
	public int admtf_deleteBook(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		int count=0;
		try {
			//JDBC 수행 1,2단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql="SELECT re_status FROM (SELECT * FROM reservation WHERE re_status=1) "
				+ "JOIN book USING(bk_num) WHERE bk_num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bk_num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	//관리자 도서 삭제 가능 여부 2) 없는 도서일 때  
	public int admtf_noBook(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		int count=0;
		try {
			//JDBC 수행 1,2단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql="SELECT bk_num FROM book WHERE bk_num=?";
			
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, bk_num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				count=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	//관리자 도서 삭제 기능 추가(내가 넣음)
	public void adm_deleteBook(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql="DELETE FROM book WHERE bk_num=?";
			
			//JDBC 수행 3단계
			pstmt=conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, bk_num);
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "건의 도서를 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {	
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	
	//관리자 회원 목록
	public void adm_selectMember() {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn=DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT * FROM member ORDER BY me_id DESC";
			//JDBC 수행 3단계
			pstmt=conn.prepareStatement(sql);
			//JDBC 수행 4단계			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("------------------------------------------");
				System.out.println("아이디\t이름\t전화번호\t\t가입일");
				System.out.println("------------------------------------------");
				do {
					System.out.print(rs.getString("me_id")+"\t");
					System.out.print(rs.getString("me_name")+"\t");
					System.out.print(rs.getString("me_phone")+"\t");
					System.out.println(rs.getDate("me_regdate"));
				}while(rs.next());
			}else {
				System.out.println("등록된 회원이 없습니다.");
			}
			System.out.println("------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//관리자 대출 목록 보기(대출 및 반납 - 모든 데이터 표시)
	public void adm_lentList() {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT re_num,re_status,me_id,bk_name,re_regdate,re_modifydate FROM reservation JOIN book USING(bk_num) JOIN member USING(me_id) ORDER BY re_num DESC";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("------------------------------------------------------");
				System.out.println("번호\t대출여부\t대출자id\t대출도서명\t대출일\t\t반납일");
				System.out.println("------------------------------------------------------");
				do {
					System.out.print(rs.getInt("re_num")+"\t");
					//System.out.print(rs.getInt("re_status")+"\t");
					
					if(rs.getInt("re_status")==0) {
						System.out.print("반납\t");
					}else {
						System.out.print("대출중\t");
					}
					
					System.out.print(rs.getString("me_id")+"\t");
					System.out.print(rs.getString("bk_name")+"\t");
					System.out.print(rs.getDate("re_regdate")+"\t");
					//System.out.println(rs.getDate("re_modifydate"));
					
					if(rs.getDate("re_modifydate")==null) {
						System.out.println("");
					}else {
						System.out.println(rs.getDate("re_modifydate"));
					}
					
				}while(rs.next());
			}else {
				System.out.println("대출된 도서가 없습니다.");
			}
			System.out.println("------------------------------------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
	}
	//사용자 아이디 중복 체크(ID 중복시 1, 미중복시 0 반환)
	public int checkID(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql = null;
		int count = 0; 
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_id FROM member WHERE me_id=?";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, me_id);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = 1;
			}//count 를 0으로 초기화시켰기 때문에 else는 필요 없다.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	//사용자 회원 가입
	public void userRegister(String me_id, String me_passwd,String me_name,String me_phone) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql ="INSERT INTO member (me_id,me_passwd,me_name,me_phone) VALUES (?,?,?,?)";
			//JDBC 수행 3단계
			pstmt=conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			pstmt.setString(3, me_name);
			pstmt.setString(4, me_phone);
			//JDBC 수행 4단계	
			pstmt.executeUpdate();
			System.out.println("회원 가입이 완료되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
		
	}
	//사용자 로그인 체크 (로그인 성공 true,로그인 실패 false 반환)
	public boolean loginCheck(String me_id,String me_passwd) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs= null;
		String sql = null;
		boolean flag = false;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "SELECT me_id FROM member WHERE me_id=? AND me_passwd=?";
			//아이디,비번 일치하면 하나의 행 만들어진다
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setString(1, me_id);
			pstmt.setString(2, me_passwd);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				flag = true;//로그인 성공
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return flag;
	}
	//사용자 도서 대출 여부 확인(도서번호(bk_num)로 검색해서  re_status의 값이 
	//								0이면 대출 가능, 1이면 대출 불가능
	public int tf_bookLent(int bk_num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		int count =0;
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql ="SELECT re_status FROM (SELECT * FROM reservation where re_status=1) "
				+"JOIN book USING(bk_num) WHERE bk_num=?";
			//JDBC 수행 3단계
			pstmt=conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, bk_num);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count = 1; 
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	
	
	//사용자 도서 대출 등록(현재 대출한 목록만 표시)
	public void bookLentReg(int bk_num,String me_id) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			sql = "INSERT INTO reservation (re_num,bk_num,me_id,re_status) VALUES (reservation_seq.nextval,?,?,1)";
			//JDBC 수행 3단계
			pstmt = conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, bk_num);
			pstmt.setString(2, me_id);
			
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println("도서 " + count + "건이 대출되었습니다.");

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
	
	//사용자 MY 대출 목록 보기(현재 대출한 목록만 표시)
	public void selectMyLent(String me_id) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn = DBUtil.getConnection();
			//SQL문 작성
			/*
			sql = "SELECT re_num,bk_name,re_status,re_regdate FROM reservation "
					+ "JOIN book USING(bk_num) ORDER BY re_num DESC";
			*/
        	sql = "SELECT re_num,bk_name,re_status,re_regdate FROM (SELECT * FROM reservation WHERE re_status=1) "
			+ "JOIN book USING(bk_num) WHERE me_id=? ORDER BY re_num DESC";
			//JDBC 수행 3단계
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, me_id);
			//JDBC 수행 4단계
			rs= pstmt.executeQuery();
			System.out.println("---------------------------");
			System.out.println("번호\t도서명\t\t대출여부\t등록일");
			if(rs.next()) {
				do {
					System.out.print(rs.getInt("re_num")+"\t");
					System.out.print(rs.getString("bk_name")+"\t\t");
				
					
					if(rs.getInt("re_status")==1) {
						System.out.print("대출중\t");
					}else {
						System.out.print("대출가능\t");
					}
					
					System.out.println(rs.getDate("re_regdate"));
					
					/*
					 * if(rs.getInt("re_status")==1) {
						System.out.print("대출중\t");
						}else {
							System.out.print("대출가능\t");
						}
					
					System.out.println(rs.getDate("re_regdate"));
					 * 
					 */
				}while(rs.next());
			}else {
				System.out.println("대출 도서가 없습니다.");
			}
			System.out.println("---------------------------");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		
	}
	//사용자 도서 반납 가능 여부(대출번호(re_num)과 회원id(me_id)를 함께 조회해서 
	//		re_status가 1인 것은 반납 가능,re_status가 0이면 반납 불가능)
	public int tr_returnbook(int re_num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		String sql = null;
		int count=0;
		try {
			//JDBC 수행 1,2단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql ="SELECT re_num,me_id,re_status FROM (SELECT * FROM reservation WHERE "
					+"re_status=1) JOIN member USING(me_id) WHERE re_num=?";
			//JDBC 수행 3단계
			pstmt=conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, re_num);
			//JDBC 수행 4단계
			rs = pstmt.executeQuery();
			if(rs.next()) {
				count=1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(rs, pstmt, conn);
		}
		return count;
	}
	
	//반납 처리할 때는 re_status를 0으로 변경하면 된다. UPDATE 하면 된다.
	//사용자 반납 처리
	public void returnBook(int re_num) {
		Connection conn = null;
		PreparedStatement pstmt= null;
		String sql = null;
		
		try {
			//JDBC 수행 1,2단계
			conn= DBUtil.getConnection();
			//SQL문 작성
			sql ="UPDATE reservation SET re_status=0,re_modifydate=SYSDATE WHERE re_num=?";
			//JDBC 수행 3단계
			pstmt=conn.prepareStatement(sql);
			//?에 데이터 바인딩
			pstmt.setInt(1, re_num);
			//JDBC 수행 4단계
			int count = pstmt.executeUpdate();
			System.out.println(count + "건의 도서가 반납되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBUtil.executeClose(null, pstmt, conn);
		}
	}
}