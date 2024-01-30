package kr.s13.iostream.input;

import java.io.IOException;

public class StandardInput01 {
	public static void main(String[] args) {
		//자바의 기본 입력 : 바이트스트림(1byte 입력)
		try {
			System.out.print("영문자 1개 입력:");
			int a = System.in.read(); //문자 하나를 입력 받아서 아스키 코드로 반환		
			System.out.println(a + ", "+(char)a);
			
			System.in.read();//enter 처리 \r 13
			System.in.read(); //enter 처리 \n 10
			
			System.out.println("--------");
			System.out.print("숫자 1개 입력:");
			int b = System.in.read() -48;  
			//System.in.read를 하면 아스키코드 값이 나오기 때문에 -48을 해준다
			System.out.println(b);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
