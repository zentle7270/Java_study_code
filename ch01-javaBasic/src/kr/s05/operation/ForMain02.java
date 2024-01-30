package kr.s05.operation;

public class ForMain02 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {   //i는 5~1까지는 true;  0이 되면 반복문을 빠져나옴 
			System.out.print(i + "\t");   //줄바꿈 안하고 tab으로 일정 구간 띄기
		}
		//위에서 줄바꿈 안해서 여기서 \n으로 해줌
		System.out.println("\n----------------------------"); 
		
		// 1) 증감식에서 짝수만 출력하게 하는 코드 
		for(int i=0;i<=10;i+=2) {   //﻿i=i+2  2씩 증가 .     
			System.out.print(i+"\t");
		}
		System.out.println("\n-----------------------------");
		
		// 2) 수행문에서 짝수만 출력하게 하는 코드 
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+"\t");	
			}
		}
		//둘중 하나 방법 선택하면 되지만 2번을 하는게 좋다
	}
}
