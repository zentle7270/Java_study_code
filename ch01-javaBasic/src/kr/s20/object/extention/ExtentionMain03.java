package kr.s20.object.extention;
//부모클래스
class A{
	int x=100;
	private int y=200;  
	
	public int getY() {
		return y;
	}
}

//자식클래스
class B extends A{
	int z=300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp=new B();  
		//private 멤버변수는 상속 관계라도 다른 클래스에서 호출은 불가
		System.out.println(bp.x);
		//System.out.println(bp.y);   // 그냥 쓰면 에러발생. private이기 때문
		System.out.println(bp.getY()); 
		System.out.println(bp.z);
	}
}