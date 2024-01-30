package kr.s24.object2.poly;
//부모클래스
class A{
	public void make() {
		System.out.println("make 메서드");
	}
}
//자식클래스
class B extends A{
	public void play() {
		System.out.println("play 메서드");
	}
}

public class PolyMain02 {
	public static void main(String[] args) {
		B bp = new B();   //make(), play() 둘다 호출 가능
		bp.make();
		bp.play();
		
		A ap=bp;  //bp의 주소를 ap에 복사// 자식 클래스타입 -> 부모클래스타입 형변환
		            //업캐스팅, 자동적으로 형변환
		ap.make();
		//호출 범위를 벗어나 호출 불가능
		//ap.play();
		
		B bp2=(B)ap; //부모클래스타입 -> 자식클래스타입 형변환
		             //다운캐스팅, 명시적으로 형변환
		bp2.make();
		bp2.play();
	}
}
