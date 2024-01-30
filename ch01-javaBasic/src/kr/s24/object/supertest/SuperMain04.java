package kr.s24.object.supertest;
//부모클래스
class People2{
	int a;
	
	//인자가 있는 생성자 정의
	public People2(int a) {  //int a로 데이터를 넘겨야만 위의 int a부분에 올라간다.
		this.a=a;
	}
}
//자식 클래스
class Student2 extends People2{
	public Student2() { 
		//부모클래스의 인자의 타입이 int인 생성자를 호출
		super(100); 
	}
}

public class SuperMain04 {
	public static void main(String[] args) {
		Student2 st = new Student2();
		System.out.println(st.a);
	}
}
