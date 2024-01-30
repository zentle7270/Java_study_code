package kr.s24.object3.instanceoftest;

//부모클래스
class Car{
	public void drive() {
		System.out.println("주행~~");
	}
	public void stop() {
		System.out.println("정지!!");
	}
}
//자식클래스
class FireEngine extends Car{
	public void water() {
		System.out.println("물 뿌리기");
	}
}
public class InstanceofMain02 {
	public static void main(String[] args) {
		FireEngine fe=new FireEngine();
		//생성된 객체 fe가 FireEngine타입을 사용할 수 있냐? 당연히 true
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		//생성된 객체 fe가 Car타입을 사용할 수 있는지 없는지 검증
		if(fe instanceof Car) {//fe는 자식타입, Car는 부모. 사용가능
			System.out.println("This is a Car instance"); 
		}//fe: 생성된 객체  Object:사용 가능한 자료형
		if(fe instanceof Object) {//Object는 Car의 부모. 사용가능.
			System.out.println("This is an Object instance");
		}
	}
}
