package kr.s11.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//관리자
public class BookAdminMain {
	
	private BufferedReader br;
	private BookDAO dao;
	
	public BookAdminMain() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			dao = new BookDAO();
			//메뉴 호출
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
	//메뉴
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.도서 등록,2.도서 목록,3.대출 목록,4.회원 목록,5.도서 삭제,6.종료>");
			try {
				int no = Integer.parseInt(br.readLine());
				if(no == 1) {//도서 등록
					/*
					 * 도서명 : 자바
					 * 카테고리 : 자바
					 * 1건의 도서 정보를 등록했습니다.
					 */
					
					System.out.print("도서명 : ");
					String bk_name = br.readLine();
					System.out.print("카테고리 : ");
					String bk_category = br.readLine();
					
					dao.adm_insertBook(bk_name,bk_category);
					
				}else if(no == 2) {//도서 목록
					/* 대출여부는 reservation과 조인하면 된다. 
					 * --------------------------------------
					 * 번호 	카테고리 	도서명 	대출여부 	등록일
					 * 42	천문		별이야기	대출가능	2023-10-10
					 * 41	IT		자바		대출중	2023-10-10
					 * ---------------------------------------
					 */
					dao.adm_selectBook();
					
				}else if(no == 3) {//대출 목록
					/*
					 * ---------------------------------------------
					 * 번호	대출여부	대출자id	대출도서명	대출일		반납일
					 * ---------------------------------------------
					 * 20	대출		blue	자바		2023-10-10				//아직 반납 안해서 반납일이 없음
					 * 19 	반납		sky		별이야기	2023-10-09	2023-10-10
					 * ---------------------------------------------
					 */
					dao.adm_lentList(); 	
				}else if(no == 4) {//회원 목록
					/*
					 * ------------------------------------------
					 * 아이디 	이름		전화번호			가입일
					 * ------------------------------------------
					 * sky		홍길동	010-1234-5678	2023-09-09
					 * blue		박영식	010-5678-1234	2023-09-08
					 * ------------------------------------------
					 */
					dao.adm_selectMember();
				}else if(no==5) {//도서 삭제
					dao.adm_selectBook();
					System.out.print("도서 번호:");
					int bk_num=Integer.parseInt(br.readLine());
					int deleterestatus=dao.admtf_deleteBook(bk_num);
					int deletenostatus=dao.admtf_noBook(bk_num);
					if(deleterestatus==1) {
						//대출된 책이 있을때는 삭제 불가능
						System.out.println("대출중인 도서입니다. 삭제가 불가능합니다.");  
					}else if(deletenostatus==0) {
						System.out.println("없는 도서입니다. 삭제가 불가능합니다.");
					}else{
						dao.adm_deleteBook(bk_num);
					}
					
				}else if(no == 6) {//종료
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e){
				System.out.println("[숫자만 입력 가능]");
			}
		}
	}
	public static void main(String[] args) {
		new BookAdminMain();
	}
}