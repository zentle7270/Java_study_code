package kr.s06.array;

public class ArrayMain03 {
	public static void main(String[] args) {
		int sum = 0; //총점을 저장할 변수 
		float average=0.0f; //평균을 저장할 변수
		//배열은 생성한 후에 배열의 길이를 늘리거나 줄일 수 없음 = 배열은 고정 길이
		//배열 선언, 생성(암시적으로 배열을 생성), 초기화
		int[] score= {100,88,88,100,90};   
			//	index가	0  1  2   3  4   ,length=5
	
		//총점 구하기
		// 				 배열의 길이
		for (int i=0;i<score.length;i++) {
			sum+=score[i]; //누적    //i: 0~4
		}
		//평균 구하기
		//		   총점     과목수 
		average = sum / (float)score.length;  //형변환
					//sum  : int-> float으로 변경됨
		System.out.printf("총점: %d%n",sum);
		System.out.printf("평균: %.2f%n",average);
	}
}
