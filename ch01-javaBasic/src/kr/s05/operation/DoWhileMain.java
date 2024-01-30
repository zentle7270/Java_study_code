package kr.s05.operation;

public class DoWhileMain {
//do ~ while과 while 비교 
	public static void main(String[] args) {
		int su = 0;
		String str="Hello world";
		
		//선 처리, 후 비교 
		do {
			System.out.println(str);
		}while(su++ < 5);  //먼저 실행한 다음에 비교   //5가 되면 빠져나감
		System.out.println("----------------");

		
		int su2 =0;
		//선 비교, 후 처리
		while(su2++ <5) {
			System.out.println(str);
			
		}
	}

}
