package kr.s02.variable;

public class VariableTypeMain01 {
	public static void main(String[] args) {
		System.out.println("===논리형===");
		//논리형 (true, false)
		boolean b = true;
		System.out.println("b = " + b);
		
		System.out.println("===문자형===");         //문자형 크기 외우기
		//문자형, 크기 : 2byte, 표현범위 : 0 ~ 65,535
		//다국어 처리를 위한 유니코드(unicode) 방식
		char c1 = 'A';  //내부적으로 아스키코드값 65
		System.out.println("c1 = " + c1);
		char c2 = 65;   // A에 해당하는 아스키코드값 65를 직접 대입
		System.out.println("c2 = " + c2);
		
		//유니코드는 역슬래시 u 라고 명시하고 16진수로  
		char c3 = '\u0041';   //A를 유니코드로 표현
		System.out.println("c3 = " + c3);
		
		char c4 = '자';
		System.out.println("c4 = " + c4);   //한글은 아스키코드 없음. 유니코드로 명시 가능
		char c5 = '\uc790';    //자를 유니코드로 표현
		System.out.println("c5 = " + c5);
		
		System.out.println("===정수형===");
		//byte, 크기 : 1byte, 표현범위 : -128 ~ 127
		byte b1 = 127;
		System.out.println("b1= " + b1);
		
		//short, 크기 : 2byte, 표현범위 : -23,768 ~ 32,767
		short s1 = 32767;
		System.out.println("s1 = " + s1);
		
		//int, 크기 :  4byte, 표현범위 -20억대~ + 20억대
		int in1 =  1234567; 
		System.out.println("in1 = " + in1);
		
		
		//long, 크기 : 8byte 
		long lo1 = 1234567L;     //1234567을 넣으면 int로 인식한 뒤 저장할때 long으로 바꿔줌. 
		//L을 넣으면 처음부터 long형 데이터로 인식    //L은 자료형을 나타냄
		System.out.println("lo1 = " + lo1); 
		
		System.out.println("===실수형===");
		//float, 크기 : 4byte
		float f1 = 9.2f;    //f는 자료형을 의미
		System.out.println("f1 = "+ f1);
		//double, 크기 : 8byte
		double d1 = 9.8;
		System.out.println("d1 = " + d1);
		
		System.out.println("===문자열 표시===");
		//문자열 표시(기본자료형이 아님, 참조자료형)
		String str = "Hello World!";
		System.out.println("str = " + str);
		
		
	}
}
