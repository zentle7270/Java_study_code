package kr.s05.operation;

public class ForMain03 {
	public static void main(String[] args) {
		//1~100까지의 합 구하기
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			//누적 
			sum+=i;   // 대입연산자를 사용하면 sum=sum+i; 의미와 똑같다
		}
		System.out.println("1부터 100까지의 합 : "+sum);
		
		System.out.println("-------------------");
		
		int total=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) {   //짝수일 경우 누적
				total+=i;
			}
		}
		System.out.println("1부터 100까지의 짝수 합 : "+total);
	}
}
