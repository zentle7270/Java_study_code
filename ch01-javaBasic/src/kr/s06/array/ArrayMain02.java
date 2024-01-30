package kr.s06.array;

public class ArrayMain02 {
	public static void main(String[] args) {
		//배열 선언 및 생성
		//배열을 생성하면 배열의 요소로 기본값이 저장됨
		//정수형 배열은 0을 기본값으로 배열을 생성 
		int[] array=new int[5];  //방이 5개. 방번호 0,1,2,3,4 . length=5. 
		// length를 배열의 길이 
		
		//반복문을 이용한 요소의 출력
						//배열의 길이
		for(int i=0; i<array.length;i++){
			System.out.println("array[" + i + "]:" + array[i]);	
		}
		
		System.out.println("--------------------");
		
		//배열의 요소 변경
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		//없는 인덱스를 호출하면 오류 발생
		//array[5]=60;
		//반복문을 이용한 배열의 요소 출력
		for(int i=0;i<array.length;i++) {
			System.out.println("array[" + i + "]:" + array[i]);	
		}
	}
}
