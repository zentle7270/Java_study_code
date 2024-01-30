package kr.s18.object.statictest;

public class StaticMain01 {
	public static void main(String[] args) {
		StaticCount sc1=new StaticCount();
		System.out.println("c: "+sc1.c+ ",count : "+StaticCount.count);
		
		StaticCount sc2=new StaticCount();
		System.out.println("c: "+sc2.c+ ",count : "+StaticCount.count);
		
		StaticCount sc3=new StaticCount(); 
		System.out.println("c: "+sc3.c+ ",count : "+StaticCount.count);
		                                         //count는 static변수이기 때문에 클래스명 StaticCount를 붙여서
		//인스턴스 변수는 정자인데, static변수는 이태리체로 눕혀져 있음. 
	}
}
