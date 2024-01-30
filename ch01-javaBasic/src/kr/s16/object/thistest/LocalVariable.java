package kr.s16.object.thistest;

public class LocalVariable {

	//멤버 변수 : 클래스 블럭 내에서 정의된 변수 
	int b=200;
	
	public LocalVariable() {//생성자
		int a =300;  //지역 변수
		int c=500;
		System.out.println("a : "+a);  //지역 변수
		System.out.println("c : "+c);  //지역 변수
	}
	public void make() {  //메서드
		//	지역 변수 : 메서드, 생성자, 제어문 블럭 내에서 생성된 변수, 
		//	해당 블럭이 종료되면 변수는 소멸함
		int a =100;
		System.out.println("a : "+a);  //지역 변수
		System.out.println("b : "+b);  //멤버 변수
		//생성자에서 생성된 지역 변수로 생성자가 종료되면 소멸됨.
		//System.out.println("c : "+c);  //지역 변수
	}	
	public static void main(String[] args) {
		for(int i=1; i<=5;i++) {  //제어문 블럭안의 지역 변수
			System.out.println(i);
		}
		System.out.println("----------------");
		//제어문 블럭밖에서 호출하면 지역 변수가 소멸해서 호출 불가
		// System.out.println(i);   for문에서 벗어났기 때문에 에러남. i는 지역변수기 때문
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
}
