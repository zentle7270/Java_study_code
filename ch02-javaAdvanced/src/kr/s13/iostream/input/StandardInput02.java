package kr.s13.iostream.input;
import java.io.IOException;
public class StandardInput02 {
	public static void main(String[] args) {
		int input =0;  //입력한 문자의 아스키코드 저장
		try {
			//﻿명시적으로 -1을 만들려면 ctrl+z 
			while((input= System.in.read())!=-1) {
				System.out.println(input+ ", (char)input : " + (char)input);
			}
		}catch(IOException e) {
			e.printStackTrace(); //예외 문구 출력
		}
	}
}