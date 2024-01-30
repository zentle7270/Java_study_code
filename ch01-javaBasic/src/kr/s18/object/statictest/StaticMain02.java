package kr.s18.object.statictest;

public class StaticMain02 {
	//인스턴스 변수
	int a;
	//static(클래스) 변수
	static String s;
	
	public static void main(String[] args) {
		//StaticMain02.s="서울";  //static 변수여서 메모리에 올라감
		//하지만 같은 클래스 안이기 때문에 StaticMain02는 생략할 수 있다. 
		s="서울";
		System.out.println(s);
		System.out.println("----------------");
		
		//인스턴스 변수는 객체 생성 후에 호출해야 사용 가능
		// a=1000;  오류난다. 왜? 
		StaticMain02 sm=new StaticMain02();
		sm.a=1000;
		System.out.println(sm.a);
	}
}
