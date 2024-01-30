package kr.s05.operation;

public class WhileMain02 {
	public static void main(String[] args) {
		//1부터 100까지의 합 구하기 
		int sum=0,su=1;
		//조건식
		while(su<=100) {
			sum+=su; //누적
			su++;	 //증감식
		}
		System.out.println("1부터 100까지의 합: " + sum);
	}
}
