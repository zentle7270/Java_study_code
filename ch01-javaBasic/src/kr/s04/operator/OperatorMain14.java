package kr.s04.operator;
public class OperatorMain14 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 은행 프로그램
		 * 잔고(balance)는 0이고 원하는 금액을 입금해서 잔고를 증가시키고
		 * 출금을 해서 잔고를 감소하게 하는 프로그램 작성
		 * 
		 * [입력 예시]
		 * 예금액:5000
		 * [출력 예시]
		 * 잔고:5,000원
		 * 
		 * [입력 예시]
		 * 출금액:2500
		 * [출력 예시]
		 * 잔고:2,500원
		 */
		java.util.Scanner input=new java.util.Scanner(System.in);
		int balance=0; //잔고
		System.out.print("예금액 : ");
		balance+=input.nextInt(); //누적  //변수를 하나 만들지 않고 balance에 바로 넣음
		/*  위 줄과 다른 형식
		int add=input.nextInt();
		balance+=add;
		*/
		System.out.printf("잔고 : %,d원%n",balance);
		
		System.out.print("출금액 : ");
		balance-=input.nextInt(); //차감   !!!!!!!!!
		/*
		int minus=input.nextInt();   //변수 써서 해도 됨 . 하지만 변수 안쓰는게 더 깔끔
		balance-=minus;
		*/
		System.out.printf("잔고 : %,d원%n",balance);

		input.close();
	}
}
