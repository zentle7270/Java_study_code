package kr.s24.object3.instanceoftest;

class Parent{//Parent의 부모가 Object
	//Object의 toString을 재정의
	@Override
	public String toString() {  
		return "Parent 클래스";
	}
}
//자식클래스
class Child extends Parent{
	@Override
	public String toString() {
		return "Child 클래스";
	}
}

public class InstanceofMain01 {
	public static void main(String[] args) {
		Parent p = new Parent();  //parent객체를 생성하게 되면 Parent와 Oject만 메모리에 올라감. 
		                           //child는 자식이니까 안올라감
		//컴파일 오류는 없지만 실행시 오류 발생
		//Child ch = (Child)p;
		
		 //p:생성된 객체    사용가능한 자료형
		if(p instanceof Child) {
			//생성된 객체가 Child타입을 사용할 수 있음
			Child ch2=(Child)p;
			System.out.println(ch2);
			System.out.println("~~~~~~~~~~~~~~~~");
		}else {//사실 Child 타입 사용할 수 없기 때문에 else로 올거임. 
			//생성된 객체가 Child타입을 사용할 수 없음
			System.out.println(p);
			System.out.println("+++++++++++++++");
		}
	}
}
