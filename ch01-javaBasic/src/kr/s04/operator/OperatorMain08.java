package kr.s04.operator;

public class OperatorMain08 {
	public static void main(String[] args) {
		/*
		 * [논리곱]
		 * 선조건  && 후조건   결과
		 * true      true  true
		 * true		false   false
		 * false	미실행	false
		 * 
		 * [논리합]
		 * 선조건  || 후조건   결과
		 * true	 	미실행	true
		 * false	 true	true
		 * false	false  false
		 */
		
		//증감연산자, 비교연산자, 논리연산자
		int a, b;
		a = b= 10;
		boolean c = a++ >= ++b && ++a > b++;       //여기서 a는 10이지만 메모리에는 11이 저장됨
		//           10     11     미실행 	    
		System.out.println(a + ", " + b);  // 11 , 11      a 메모리에는 11이 저장되었기 때문.
		System.out.println("c : " + c);    // c : false
		
		System.out.println("--------------");
		
		int d,e;
		d =e =10;
		
		boolean f = ++d > e++ || d++ >= ++e;
		//  		11     10 	 미실행
		//  		true        
		System.out.println(d + "," + e);  // 11, 11
		System.out.println("f = " + f);   // f = true 
		
		boolean y = ++d < e++ || d++ >= ++e;    //중요 !!!!!!!!
		//			11    10     11      12
		//			false		 flase
		System.out.println(d + "," + e);  // 12, 12
		System.out.println("f = " + f);   // y = false
		
		
	}
}
