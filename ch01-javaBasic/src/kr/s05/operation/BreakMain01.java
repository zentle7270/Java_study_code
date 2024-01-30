package kr.s05.operation;

public class BreakMain01 {
	public static void main(String[] args) {
		//break는 반복문에서 특정 조건일 때 반복문을 빠져나가는
		//용도로 사용함 
		int n=1;
		while(n<=10) {
			System.out.println(n);
			n++;
			//7출력한 다음에 8에서 break
			if(n==8) break;
		}
	}
}
