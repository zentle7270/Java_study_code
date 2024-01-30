package kr.s20.object.extention;

//부모 클래스
class Parent{  
	int a =100;   //메모리에 올라가게 됨
}
//자식 클래스
class Child extends Parent{ //자식쪽에 부모의 기능을 줌
	int b=200; //메모리에 올라가게 됨    실제로는 Child에 b밖에 없는데 상속 시켜서 a도 사용 가능
}

public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch=new Child();   
		System.out.println(ch.a);  //만약 상속 관계가 아니면 a에 에러 발생
		System.out.println(ch.b);  
	}
}
