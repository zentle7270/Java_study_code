package kr.s24.object4.finaltest;

class A{
	//지정한 값은 변경 불가능
	final int NUM =10;  
	public static final int NUMBER = 20; //static한 상수 
}

public class FinalMain01 {
	public static void main(String[] args) {
		A ap=new A(); //객체 생성
		//상수는 변경 불가능
		//ap.NUM=20;
		System.out.println(ap.NUM);
		
		//static 상수 //static 상수는 객체 생성과 무관하게 메모리에 올라간다
		System.out.println(A.NUMBER);  //객체 생성을 안하기 때문에 클래스명을 붙인다.
		
		//상수
		final int NO=30;
		System.out.println(NO);
	}
}
