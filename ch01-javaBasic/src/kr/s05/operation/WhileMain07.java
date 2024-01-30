package kr.s05.operation;

public class WhileMain07 {
	public static void main(String[] args) {
		
		java.util.Scanner input= new java.util.Scanner(System.in);
		long balance=0L;   //잔고      L은 자료형. 처음부터 long형 데이터로 인식하기 위해서 L추가함. 
		while(true) {
			System.out.println("---------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 확인 | 4.종료");
			System.out.println("---------------------");
			
			System.out.print("메뉴 선택>");
			int num=input.nextInt();
			
			//조건 체크해줌
			if(num==1) {//예금
				System.out.print("예금액>");
				balance += input.nextLong();  //누적	
			}else if(num==2) {//출금
				System.out.print("출금액>");
				balance-=input.nextLong();	  //차감
			}else if(num==3) {//잔고 확인
				System.out.printf("잔고 : %,d원%n", balance);
			}else if(num==4) {//종료
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		input.close();    //무한 루트일때 에러남. 그래서 break문을 넣어줌. 그러면 에러 없어짐 
	}
}
