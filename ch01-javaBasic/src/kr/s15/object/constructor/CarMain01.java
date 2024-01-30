package kr.s15.object.constructor;

//객체를 생성할 클래스를 하나 만듦
class Car{
	//멤버 변수
	String color;
	String gearType;
	int door;
	
	//기본 생성자는 생략 가능
	public Car() {}
}

public class CarMain01 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		//생성자는 객체 생성시 단 한번 실행되고 
		//객체 생성 이후에는 호출 불가능
		//생성자는 멤버 변수를 초기화 하는 역할 수행
		Car c1 = new Car();    //뒤의 Car가 생성자가 됨. 
		System.out.println(c1.color+","+c1.gearType+","+c1.door);
		
		//멤버 변수의 데이터 변경
		c1.color="white";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color+","+c1.gearType+","+c1.door);
	}
}
