package kr.s04.operator;

public class OperatorMain09 {
	public static void main(String[] args) {
		System.out.println("===조건(삼항)연산자===");
		int x =10;
		int y = -10;
		// 절대값 구하는 방법임
		// 			조건 ?  참값 : 거짓값
		int absX = x >= 0 ? x : -x;
		int absY = y >= 0 ? y: -y;
		System.out.println("x=10일 때, x의 절대값은 " + absX);
		System.out.println("y=-10일 때, y의 절대값은 "+ absY);
		
	}
}
