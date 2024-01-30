package kr.s10.object.method;

class Tv{
	//Tv의 속성(멤버 변수)
	boolean power; //전원상태(on/off)
	int channel;  //채널
	//Tv의 동작(멤버 메서드)
	public void isPower() {
		power=!power;  //false이면 true로..true이면 false로 
	}
	public void channelUp() {   
		++channel;
	}
	public void channelDown() {
		--channel;
	}	
}
public class TvMain {
	public static void main(String[] args) {
		Tv t = new Tv();
		t.isPower();//처음에는 tv가 꺼져 있기 때문에 켜준다.
		System.out.println("Tv실행 여부: "+t.power);
		System.out.println("현재 채널: "+t.channel);
		System.out.println("------------------");
		
		t.channel=7;
		System.out.println("첫번째 변경된 채널: " + t.channel);
		System.out.println("------------------");
		
		t.channelDown();
		System.out.println("두번재 변경된 채널 : "+t.channel);  
		System.out.println("------------------");
		
		t.isPower();
		System.out.println("Tv 실행 여부: " + t.power);  
	}
}
