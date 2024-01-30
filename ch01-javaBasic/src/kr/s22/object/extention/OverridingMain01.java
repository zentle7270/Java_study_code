package kr.s22.object.extention;
//메서드 오버라이딩 예쩨
//부모클래스
class GrandParent{
	public String getCar(){
		return "구형 자동차";
	}
}
//자식클래스
class Father extends GrandParent{ //뼈대는 그대로 쓰고, return 내용만 변경
	/*
	 * Method Overriding, 메서드 재정의
	 * 상속관계에서자식클래스에 메서드 재정의를 하면 부모클래스의 
	 * 메서드가 호출되는 것이 아니라 자식클래스의 메서드가 호출됨
	 */
	public String getCar() {  //메서드 오버라이딩한 내용 출력됨
		return "신형 자동차";
	}
}
class Uncle extends GrandParent{ //원형 그대로 사용
	
}
public class OverridingMain01 {
	public static void main(String[] args) {
		Father ft=new Father();
		System.out.println(ft.getCar());
		Uncle uc=new Uncle();
		System.out.println(uc.getCar()); 
	}
}
