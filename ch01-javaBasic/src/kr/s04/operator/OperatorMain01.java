package kr.s04.operator;

public class OperatorMain01 {
	public static void main(String[] args) {
		System.out.println("===증감 연산자===");
		//증가연산자
		int i = 5; //증가 연산자를 변수 앞에 명시하면 변수값을 1 증가시킨 후 증가된 값을 읽어온다
		System.out.println(++i);  // 6 출력
		System.out.println("-----------");
		//증가연산자를 변수 뒤에 명시하면 변수값을 먼저 읽어온 후 메모리의 변수 값을 1 증가시킴. 
		// 증가된 값을 보기위해서는 한번더 호출해야 함 
		System.out.println(i++); //6 출력
		System.out.println(i); // 7 출력
		System.out.println("-----------");
		
		//감소 연산자
		int j = 10;
		System.out.println(--j);  // 9 출력
		System.out.println("----------------");
		System.out.println(j--);  // 9 출력 
		System.out.println(j);   // 8 출력
		
		
		
		
	}
}
