package kr.s08.object.field;

//public은 main있는 클래스만 사용가능. 
class Car{
	//멤버 변수
	String company="현대자동차";   
	String model = "그랜저";
	String color="검정";
	int maxSpeed=350;
	int speed = 90;
}
public class CarMain {
	public static void main(String[] args) {	
		//객체 선언 및 생성
		Car myCar =new Car();
		//객체의 멤버 변수의 값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
		System.out.println("---------------");
		//멤버 변수의 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);	
	}
}


