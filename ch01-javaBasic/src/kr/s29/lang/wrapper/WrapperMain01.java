package kr.s29.lang.wrapper;

public class WrapperMain01 {
	public static void main(String[] args) {
		boolean b = true; //기본자료형 데이터
		//예전에 사용했던 방법
		Boolean wrap_b=new Boolean(b); //기본자료형 데이터 -> 참조자료형 데이터
										//boxing
		boolean b2=wrap_b.booleanValue(); //참조자료형 데이터 -> 기본자료형 데이터
										//unboxing
		System.out.println(b2);
		
		System.out.println("------------------");
		//지금 사용하는 방법
		//Character 객체 생성
		Character wrap_c='A';  //auto boxing
		System.out.println(wrap_c); //auto unboxing
	}
}
