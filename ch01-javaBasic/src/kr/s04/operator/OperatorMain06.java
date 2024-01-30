package kr.s04.operator;

public class OperatorMain06 {
	public static void main(String[] args) {
		System.out.println("===비교(관계)연산자===");
		boolean result;
		int a = 10; 
		double b = 10.5;  //자료형이 다르더라도 자동적으로 형변환이 됨
		
		result = a < b ;    //a는 형변환 되서 10.5가 됨. 
		System.out.println("a < b : " + result);
		
		result = a > b;    
		System.out.println("a > b : " + result);
		
		result = a >= b;
		System.out.println("a >= b : " + result);
		
		result = a <= b;
		System.out.println("a <= b : " + result);
		
		result = a == b;
		System.out.println("a == b : " + result);
		
		result = a!=b;
		System.out.println("a != b : " + result);
	}
}