package kr.s20.object.extention;
//부모 클래스
class People{
	public void eat() {
		System.out.println("식사하다.");
	}
}
//자식 클래스
class Student extends People{  //공부하다 기능, 식사하다 기능 모두 사용할 수 있다. 	// People이 상속해주기 때문에
	public void study() {
		System.out.println("공부하다.");
	}
}
public class ExtentionMain02 {
	public static void main(String[] args) {
		Student s = new Student();
		s.eat(); //People의 메서드를 상속 받아서 호출
		s.study(); //Student의 메서드 호출
	    System.out.println(s.toString());//Object의 메서드를 상속 받아서 호출		
	}
}
