package kr.s07.inner.member;

class Outer{
	int x=100;
	
	//멤버내부클래스
	class Inner{
		int y=200;
	}
}
public class MemberMain01 {
	public static void main(String[] args) {
		Outer ot= new Outer();
//Outer.Inner : 자료형      //Outer 객체에 접근해서 Inner 객체 생성
		Outer.Inner oi =ot.new Inner();
		System.out.println("x = " + ot.x);
		System.out.println("y = " + oi.y);
	}
}
