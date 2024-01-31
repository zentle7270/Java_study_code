package kr.s01.basic;

public class DriverMain {
	public static void main(String[] args) {
		try {
			//실제 오라클드라이버가 있는지 확인
			Class.forName("oracle.jdbc.OracleDriver"); //경로 명시
	//Class.forName은 문자열에 명시되어 있는 경로에 가서 검사한다음에 메모리에 올려주는 작업까지 담당한다.
			System.out.println("오라클 드라이버가 정상적으로 로드되었습니다.");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
