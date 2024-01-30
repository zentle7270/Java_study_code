package kr.s12.object.overloading;

public class OverloadingMain02 {
	//전달되는 인자의 타입을 모두 String으로 변환해서 문자열의 길이를 
	//구하는 메서드 만들기
	public void getLength(int n) {
		String s = String.valueOf(n);  //int -> String 변환
		getLength(s);
	}
	public void getLength(float n) {
		String s = String.valueOf(n);  //float -> String 변환
		getLength(s);     //호출해서 코드 줄이기
	}
	public void getLength(String s) {
		System.out.println(s + "의 길이 : "+ s.length());
		
	}
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000);  //10000이 n에 전달되고 string으로 변환됨
		om.getLength(3.14f);   //f는 자료형이어서 카운트 안됨
		om.getLength("Hello");
	}
}  //기능이 같은 경우 메서드명을 동일하게해서 편리하게
