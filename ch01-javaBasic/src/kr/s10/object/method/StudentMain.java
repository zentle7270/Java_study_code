package kr.s10.object.method;

public class StudentMain {  //멤버 변수부터 멤버 메서드까지 메모리에 올라감. 
								//그래서 같이 사용할 수 있음
	//멤버 변수
	String name;
	int korean;
	int math;
	int english;
	
	//멤버 메서드
	//총점 구하기
	public int makeSum() {   //메서드 안에서 멤버 변수 사용 가능
		return korean+math+english;
	}
	//평균 구하기
	public int makeAverage() {  //메서드 안에 메서드 사용 가능
		return makeSum()/3;
	}
	//등급 구하기
	public String makeGrade() {
		String grade;
		switch(makeAverage()/10) {
		case 10:
		case 9: grade="A"; break;  //문자열이니까 더블쿼터
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default :
			grade="F";
		}
		return grade;
	}
	public static void main(String[] args) {
		StudentMain student= new StudentMain();
		student.name="홍길동";
		student.korean=98;
		student.math=97;
		student.english=96;
		
		System.out.println("이름: " + student.name);
		System.out.println("국어: "+student.korean);
		System.out.println("수학: "+student.math);
		System.out.println("영어: "+student.english);
		System.out.println("총점: "+student.makeSum());
		System.out.println("평균: "+student.makeAverage());
		System.out.println("등급: "+student.makeGrade()); 
	}

}
