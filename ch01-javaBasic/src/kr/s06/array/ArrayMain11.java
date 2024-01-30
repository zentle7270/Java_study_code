package kr.s06.array;

public class ArrayMain11 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 단을 입력 받아서 1~9까지 곱하는 구구단 프로그램
		 * 값을 구하고 배열에 그 값을 저장한 후 배열로부터 저장된 값을 
		 * 읽어서 구구단 형식(2*1=2)으로 출력하시오.
		 * [입력 예시]
		 * 단 입력:2
		 * [출력 예시]
		 * 2*1=2
		 * 2*2=4
		 * --
		 * --
		 * 2*9=18
		 */
		int[] array = new int[9];
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.print("단 입력: ");
		int dan=input.nextInt();
		
		for(int i=0;i<array.length;i++) {
			array[i]=dan*(i+1);	  //i : 0 ~ 8  , i+1: 1~9   
			//구구단 출력
			System.out.println(dan+"*"+(i+1)+"="+array[i]); 
		}
		input.close();
	}
}