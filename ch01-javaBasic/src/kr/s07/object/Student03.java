package kr.s07.object;

public class Student03 {
	//멤버 변수 
	String name;
	int age;
	String hobby;
	String job;
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		Student03 student = new Student03();  //생성될때 student에 객체 주소가 저장됨. 참조변수  
	//앞의 Student03은 자료형 	//뒤 Student03()은 생성자 
		//객체의 멤버 변수에 값 할당
		student.name="홍길동";
		student.age=20;
		student.hobby="축구";
		student.job="대학생";	 
		
		System.out.println("이름: " + student.name);
		System.out.println("나이: " + student.age);
		System.out.println("취미: " + student.hobby);
		System.out.println("직업: " + student.job);
		System.out.println("----------------------");
		
		Student03 student2= new Student03();
		student2.name="장영실";
		student2.age=19;
		student2.hobby= "야구";
		student2.job="고등학생";
		
		System.out.println("이름: " + student2.name);
		System.out.println("나이: " + student2.age);
		System.out.println("취미: " + student2.hobby);
		System.out.println("직업: " + student2.job);
	}
}