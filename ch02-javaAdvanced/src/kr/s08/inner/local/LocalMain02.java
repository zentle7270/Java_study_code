package kr.s08.inner.local;

public class LocalMain02 {
	//멤버메서드
	public void innerTest(int a) {  //int a 앞에 암묵적으로 final이 있는거다. 
		//a가 지역변수에서 자동으로 상수화되기 때문에
		//값을 변경할 수 없음
		//a=500;
		
		int b = 200;
		//b가 지역변수에서 자동으로 상수화되기 때문에
		//값을 변경할 수 없음
		//b=10;
		
		//로컬내부클래스
		//로컬내부클래스가 포함된 메서드의 지역변수를 로컬내부클래스에서 가져다 쓰게 하기 위해 지역변수를 상수화함. 
		//따라서 상수화된 값은 변경 불가능 
		class Inner{
			public void getData() {
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				//상수화되어 변경 불가능
				//a=100;
				//b=200;
			}
		}
		//로컬내부클래스 객체 생성
		Inner i = new Inner(); 
		i.getData();  //메서드 동작시키기
	}
	
	public static void main(String[] args) {
		LocalMain02 lo = new LocalMain02();
		lo.innerTest(70);
	}
}
