package kr.s05.operation;

public class IfMain03 {
	public static void main(String[] args) {
		System.out.println("==if~else==");
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.print("정수 하나 입력 : ");
		int a = input.nextInt();
		
		//if~else : 조건이 true이면 if블럭의 수행문을 실행
		//			조건이 false이면 else 블럭의 수행문을 실행
		if (a%2==1)
			System.out.println("홀수이다");
		else
			System.out.println("짝수이다");   //무조건 두개 중 하나는 실행된다
		
		input.close();
	}

}
