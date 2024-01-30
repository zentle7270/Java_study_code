package kr.s09.inner.statictest;

public class StaticMain {
	//내부클래스에 static을 명시하면 내부클래스를 감싸고 있는 클래스를 
	//객체 생성하지 않고 내부클래스를 직접 객체 생성해서 사용 가능
	public static class StaticInner{
		int iv = 200;
		static int cv = 300;
		static void make() {
			System.out.println("하하");
		}
	}
	
	public static void main(String[] args) {
		StaticInner i = new StaticInner(); 
		System.out.println(i.iv);  //인스턴스 변수는 객체 생성 후 호출
		
		//static 변수
		System.out.println(StaticInner.cv);
		//static 메서드
		StaticInner.make(); 
		//원래 StaticMain.StaticInner.make()인데 같은 클래스 안이므로 StaticMain을 생략 가능
	}
}
