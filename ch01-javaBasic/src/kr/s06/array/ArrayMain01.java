package kr.s06.array;

public class ArrayMain01 {
	public static void main(String[] args) {
		char[] ch; //배열 선언  //ch는 배열의 주소
		ch=new char[4];  
		
		//배열의 초기화
		ch[0]='J';  //자료형이 문자형이라 문자만 넣을 수 있음 
		ch[1]='a';
		ch[2]='v';
		ch[3]='a';
		
		//저장된 데이터를 "배열의 요소"라고 한다. 배열의 요소는 Java
		//배열의 요소 출력
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println("-------------");
		
		//반복문을 이용한 배열의 주소 출력
						//배열의 길이    // ch.length = 4
		for(int i=0;i< ch.length;i++) {
			System.out.println("ch["+i+"]:"+ch[i]); //i : 0~3
		}
		System.out.println("---------------");
		
		//배열의 선언, 생성 같이
		int[] it=new int[6];     // int[] 는 배열의 자료형 을 뜻함
		//배열의 선언, 생성(명시적 배열 생성), 초기화 같이
		char[] ch2= new char[] {'자','바'};   
		//배열의 선언, 생성(암시적 배열 생성), 초기화 같이
		char [] ch3= {'강','남','구'};
	}
}
