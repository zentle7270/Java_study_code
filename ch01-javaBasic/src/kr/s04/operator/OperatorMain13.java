package kr.s04.operator;

public class OperatorMain13 {

	public static void main(String[] args) {
		/*
		 * 제출: pinos71@daum.net
		 * [숙제]
		 * A전자대리점에서는 그날 물건 판매액의 15%를 할인해주시기로 했습니다.
		 * 판매한 상품명과 상품의 단가와 수량을 입력해서 
		 * 지불 금액을 출력하는 프로그램을 작성하시오. (단, 출력 시에는 소수점 이하 절삭)  
		 * 
		 * [입력 예시]
		 * 상품명 입력 : 냉장고
		 * 단가 입력 : 500000
		 * 판매 수량 입력 : 3
		 * 
		 * [출력 예시]
		 * 냉장고 3대 가격은 1,275,000원 
		 * 
		 */
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("상품명 입력 : ");
		String product = input.nextLine();
		
		System.out.print("단가 입력 : ");
		int price = input.nextInt();
		
		System.out.print("판매 수량 입력 : ");
		int quantity = input.nextInt();
		
		//구매한 상품의 지불 금액 연산
		//1) 1번 방법
		int total=(int)(price*quantity*0.85); 
		//price*quantity*0.85가 double 데이터여서 int로 형변환해줌
		
		//2) 2번 방법
		//int total=price*quantity*85/100;
		//3) 내가 한 코드 
		//result= (price*quantity)-(price*quantity/100*15);
		
		System.out.printf("%s %d대 가격은 %,d원",product,quantity,total);
		input.close();
	}
}
