package kr.s05.operation;

public class IfMain07 {
	public static void main(String[] args) {
		
		/*
		 *[실습] 
		 * 정수 하나를 입력하여 짝수면 10을 더하고 홀수이면 20을 더하여 결과를 출력하시오.
		 * 
		 * [입력 예시]
		 * 결과 : 25
		 */

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		
		int a, result;
		a = input.nextInt();
		if(a%2==0) { //짝수
			result = a+10;
		}else {
			result = a+20;
		}
				
		System.out.printf("결과 : %d%n",result);
		
		
		
		/*
		int num= input.nextInt();      // num 하나만 변수로 지정해줌 
		
		if(num%2==0) {  
			num+=10;
			System.out.printf("결과 : %d%n",num);    //num을 그대로 사용했을때 num의 값이 변형되게 됨 
		}else{
			num+=20;
			System.out.printf("결과 : %d%n",num);
		}
		System.out.printf("결과 : %d%n",num);    // if문을 나왔을 때 num이 입력값이 아닌 더한 값이 나와서 
												//혼동할 수 있기 때문에 result라는 변수를 하나 더 지정해주기!!!!!
		*/
	}
}
