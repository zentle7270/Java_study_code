package kr.s15.object.constructor;

class Car2{
	String color;
	String gearType;
	int door;
	//생성자 오버로딩
	public Car2() {}
	public Car2(String c, String g, int d) {
		color =c;
		gearType=g;
		door=d;
	}
}

public class CarMain02 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();  //기본값 세팅
		c1.color = "white";
		c1.gearType="auto";
		c1.door=2;
		System.out.println(c1.color+","+c1.gearType+ ","+c1.door);
		System.out.println("---------------------------");
		Car2 c2 = new Car2("blue","manual",5);  //데이터를 처음부터 갖고 출발
		
		System.out.println(c2.color + "," + c2.gearType + ","+ c2.door); 
	}
}
