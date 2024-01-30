package kr.s24.object2.poly;

//부모 클래스
class Parent{
	int a =100;
}
//자식클래스
class Child extends Parent{
	int b = 200;
}
public class PolyMain01 {
	public static void main(String[] args) {
//Child:참조자료형
		Child ch= new Child();   
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		//자식 클래스 타입 -> 부모클래스타입 형변환
		//업캐스팅, 자동적으로 형변환
		Parent p= ch; //ch안에 Child객체를 가리키는 주소를 가지고 있다. 이 주소를 p에 복사
		System.out.println(p.a);
		//호출 범위를 벗어나서 호출이 불가능   //메모리에 b는 있다. 
		//System.out.println(p.b); //에러남. Parent라고 하면 Parent영역에 있는 것만 가능. 
		
		//강제형변환이다.줄어들었던 것을 강제로 늘려주기 때문
		//Child ch2 =p; //p의 주소를 ch2에 복사해줌 
		Child ch2 = (Child)p; //부모클래스타입 ->자식클래스타입 형변환
								//다운캐스팅, 명시적으로 형변환
		System.out.println(ch2.a);
		System.out.println(ch2.b);
	}
}
