package kr.s05.operation;

public class WhileMain03 {

	public static void main(String[] args) {
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.print("단 입력:");
		int dan = input.nextInt();
		System.out.println(dan + "단");
		System.out.println("-------------------");
		int i=1; //초기값
		while(i<=9) {   //i : 곱해지는 수 1~9
			System.out.println(dan + "*"+i + "=" + dan*i);
			i++;   //증감식		 꼭 써줘야함!!!!!!!!!!!
		}
	}
}
