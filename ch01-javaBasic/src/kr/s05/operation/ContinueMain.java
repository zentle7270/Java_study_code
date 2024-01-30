package kr.s05.operation;

public class ContinueMain {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			//특정 조건일 때 수행문의 실행을 멈추고 다음 반복 회차로 건너뜀
			if(i%3==0) { //3의 배수
				continue; //0,3,6,9에서는 실행을 하지 말라는 소리
			}
			System.out.println(i);
		}
	}
}
