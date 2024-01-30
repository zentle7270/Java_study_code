package kr.s24.object.supertest;

//부모 클래스
class People{
	int a = 100;
	
	//생성자
	public People() {
		super();  //people의 부모인 Object의 인자가 없는 생성자 호출
	}
}
//자식 클래스
class Student extends People{
	int b = 200;
	
	//생성자   super명시 안해도 자동으로 들어간다.
	public Student() {
		//부모클래스의 인자가 없는 생성자 호출
		super();    //이런 장치를 통해서 메모리에 올라가도록 한다.
	}
}
public class SuperMain03 {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.a);
		System.out.println(s.b);
	}
}
