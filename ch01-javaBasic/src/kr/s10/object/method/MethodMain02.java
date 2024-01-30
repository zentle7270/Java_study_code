package kr.s10.object.method;
import java.util.Scanner;

public class MethodMain02 {
	/*
	 * [실습]
	 * 입력한 int형 정수값이 음수이면 -1을, 0이면 0을, 양수이면 1을
	 * 반환하는 signOf 메서드를 작성하자
	 * [입력 예시]
	 * 정수 x:50
	 * [출력 예시]
	 * signOf(x)는 1입니다.
	 */	
	public int signOf(int s) {
		int sign=0;
		if(s>0) {
			sign = 1; 
		}else if(s<0){
			sign = -1;    
		} //else에 원래 0을 해야하는데 이미 sign에 0이 있으므로 생략해도 됨
		return sign;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 x:");
		int x = input.nextInt();

		MethodMain02 me= new MethodMain02();
		int result=me.signOf(x);
		System.out.println("signOf(x)는 "+result+"입니다.");
		input.close();
	}
}
