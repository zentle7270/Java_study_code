package kr.s07.object;

public class Student01 {
	//멤버 변수 (객체의 구성원) 
	String name;
	int age;
	
	public static void main(String[] args) {
		//객체 선언
		Student01 student; 
		//객체 생성
		student = new Student01();   //student01 안에 name, age가 들어가 있다 
									//new: 객체가 생성돼라!
		//객체의 멤버 변수에 값 할당
		student.name="홍길동";
		student.age=20;
		
		//객체의 멤버 변수 값 출력
		System.out.println(student.name+","+student.age);  
		//객체의 하위요소에 가려면 점을 찍는다.
	}
}