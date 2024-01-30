package kr.s15.iostream.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br=null;
		try {                           //문자스트림 <--- 바이트스트림(표준입력)
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("당신의 이름:");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.println("당신의 나이:");
					//String -> int
			int age = Integer.parseInt(br.readLine()); //NumberFormatExceptio 발생할 수 있음
			System.out.println(age); 
			
		}catch(NumberFormatException e ) {
			System.out.println("숫자를 입력하세요");
		}catch(IOException e) {
			System.out.println("입력시 오류 발생!!");
		}finally {
			//자원정리
			if(br!=null)try {br.close();}catch(IOException e) {}
		}

	}
}
