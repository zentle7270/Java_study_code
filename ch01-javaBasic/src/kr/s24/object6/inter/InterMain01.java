package kr.s24.object6.inter;

interface A1{
	//상수
	public static final int W = 10; //원형
	int X =20;  //변수가 아니라 상수 (public static final)이 생략되어 있음
	static int Y=30; //public final  생략
	final int Z=40;
}

public class InterMain01 {
	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가능
		//A1 ap=new A1();
		
		System.out.println("W = " + A1.W); //static한 상수여서 앞에 클래스명 붙임
		System.out.println("X = " + A1.X);
		System.out.println("Y = " + A1.Y);
		System.out.println("Z = " + A1.Z);
		
		//상수는 변경 불가능
		//Al.X=100;
	}
}
