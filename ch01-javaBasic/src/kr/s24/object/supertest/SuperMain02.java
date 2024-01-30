package kr.s24.object.supertest;

class Parent{
	public void play() {
		System.out.println("피아노를 연주하다");
	}
}
class Child extends Parent{
	//메서드 오버라이딩(재정의)
	@Override
	public void play() {
		System.out.println("첼로를 연주하다");
	}
	
	public void playSomthing() {  
		//첼로 말고 가끔 피아노를 연주하고 싶을때 사용
		super.play();
	}
}
public class SuperMain02 {
	public static void main(String[] args) {
		Child ch= new Child();
		ch.play();
		ch.playSomthing();
	}
}
