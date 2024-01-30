package kr.s06.array;

public class SecondArrayMain03 {
	public static void main(String[] args) {
		java.util.Scanner input=new java.util.Scanner(System.in);
		//과목명
		String[] course= {"국어","영어","수학"};
		//인원수
		System.out.print("인원수 :");
		int num=input.nextInt();
		
		
		//성적이 저장될 2차원 배열 선언 및 생성
							//인원수  과목수
		int[][] score=new int[num][course.length];
		//총점
		int[] sum = new int[num];
		//평균
		float[] avg=new float[num];
		
		//성적을 입력 받고 총점과 평균 구하기
		for(int i=0; i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				//성적을 입력 받음
				do {
					//과목명 출력
					System.out.print(course[j]+"=");
					score[i][j] = input.nextInt();
				}while(score[i][j]< 0 || score[i][j]>100);
				//총점 구하기
				sum[i]+=score[i][j];
			}//end of inner for
			//평균 구하기
			
			avg[i]=sum[i]/(float)score[i].length;  //=course.length;
			System.out.println();  //단순 줄바꿈
		}//end of outer for
		
		//총점과 평균 출력
		for(int i=0; i<num;i++) {      //num: 인원수 를 이용함
			System.out.println();  //단순 줄바꿈
			System.out.printf("총점 = %d%n",sum[i]);
			System.out.printf("평균 = %.2f%n",avg[i]);
		}
		input.close();
	}
}
