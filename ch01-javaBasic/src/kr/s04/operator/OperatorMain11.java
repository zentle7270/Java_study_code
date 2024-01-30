package kr.s04.operator;

public class OperatorMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 키보드에서 입력한 정수값에 마지막 자리수를 제외한 값과
		 * 마지막 자리수를 표시
		 * (힌트)123을 입력하면 마지막 자리수를 제외한 값은 12이고
		 * 마지막 자릿수는 3이 된다.
		 * 
		 * [입력 예시]
		 * 정수값: 123
		 * [출력 예시]
		 * 마지막 자릿수를 제외한 값: **
		 * 마지막 자릿수 : *
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("정수값: ");
		int num = input.nextInt();     //123입력   
	
		System.out.println("마지막 자릿수를 제외한 값 :" + (num/10));  
		System.out.println("마지막 자릿수 : " + num%10);  		
		// num%10에 가로 안넣어도 됨. 우선순위가 높기 때문
		
		input.close();
		}
}
