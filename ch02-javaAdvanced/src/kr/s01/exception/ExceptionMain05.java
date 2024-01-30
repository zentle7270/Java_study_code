package kr.s01.exception;

public class ExceptionMain05 {
	public static void main(String[] args) {
		System.out.println("===예외가 발생하지 않았을 경우===");
		try {
			System.out.println("1");
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3"); //예외가 발생하지 않아 출력 안됨
		}finally {
			System.out.println("4");
		}
		System.out.println("프로그램 종료!!");
		System.out.println("------------------");
		
		System.out.println("====예외가 발생한 경우===");
		
		try {
			System.out.println("1");
			System.out.println(10/0);//예외 발생. 정수를 0으로 나누면 ArithmeticException 발생
									//예외 발생하니까 2를 실행 못함. 3으로 감
			System.out.println("2");
		}catch(Exception e) {
			System.out.println("3");
		}finally {
			System.out.println("4");  
		}
		System.out.println("프로그램 종료!!");
	}
}

