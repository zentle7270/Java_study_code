package kr.s07.object;

public class Student02 {
	//멤버 변수
	String name;
	int age;
	String hobby;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student02 student = new Student02();   //student에는 객체 주소 보관됨.
												//student를 참조 변수라고 부른다
		//객체가 생성되면 객체의 멤버 변수는 기본값으로 초기화됨
		System.out.println(student.name+ "," + student.age + ","+student.hobby); //null,0,null 출력됨	
		System.out.println("---------------------");
		
		//객체의 멤버 변수에 값 할당
		student.name ="박문수";
		student.age=20;
		student.hobby="축구";
		
		System.out.println(student.name+","+student.age+ ","+student.hobby);
	}
}
