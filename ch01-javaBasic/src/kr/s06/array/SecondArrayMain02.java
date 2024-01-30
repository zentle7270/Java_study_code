package kr.s06.array;

public class SecondArrayMain02 {
	public static void main(String[] args) {
		//2차원 배열의 선언 및 생성, 초기화
		int[][] score= {
						{99,89,91},
						{98,89,95},   //5명의 성적
						{97,82,94},
						{96,81,93},
						{95,80,92}
						};
		System.out.println("번호 국어 영어 수학 총점 평균");  //학생은 번호로 표기
		System.out.println("========================");
						//행의 길이
		for(int i=0; i<score.length;i++) {  //i:행의 번호(0~4)
			int sum = 0;
			//번호 출력
			System.out.print(" "+(i+1)+" ");  //정렬 처리 해주려고 공백 넣음. 번호의 '호'에 정렬. 
			//            열의 길이
			for(int j=0;j<score[i].length;j++) {  //j: 열의 번호(0~2)
				//총점 구하기
				sum+=score[i][j];  
				//과목 점수 출력
				System.out.print(score[i][j]+ " ");
			}//end of inner for
			//총점 출력 및 평균을 구하고 출력       열의 길이(과목수)
			System.out.println(sum+" "+sum/score[i].length);
		}//end of outer for
	}
}
