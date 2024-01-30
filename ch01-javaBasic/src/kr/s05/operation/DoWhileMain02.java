package kr.s05.operation;

public class DoWhileMain02 {
	public static void main(String[] args) {
		java.util.Scanner input= new java.util.Scanner(System.in);
		//do while을 사용한 예
		int korean, english, math, sum;
		char grade;
		float avg;   //평균
		
		//do블럭에서 입력한 값을 조건 체크해서 0부터 100사이이면 조건이
		//false가 되어 do ~ while 블럭을 빠져나감
		
		do {    //입력 받아야하니까 조건 체크 전에 한번은 실행되어야 함 
			System.out.print("국어 =");
			korean = input.nextInt();
		}while(korean<0 || korean >100); //음수이거나 100보다 크면 true가 되서 값을 인정하지 않아 루프를 다시 돌아야함
										//90이면 조건이 false이기 때문에 빠져나감. 그리고 데이터 확정
		do {
			System.out.print("영어 =");
			english = input.nextInt();
		}while(english<0 || english >100);
		
		do {
			System.out.print("수학 =");
			math = input.nextInt();
		}while(math<0 || math >100);
		
		//총점 구하기
		sum=korean+english+math;
		//평균 구하기
		avg=sum/3.0f;    // sum/3.0이라고 하면 double이라 에러 남. 그래서 3.0f라고 해서 float으로 해줘야함
							//!!!!!!!!!!!!!!!!!!!!
		//등급 구하기
		switch((int)(avg/10)) {   //인자값이 int거나 문자열이어야함. 근데 avg/10 이 float이니까 강제로 형변환시켜야함
		case 10:
		case 9: grade='A'; break;
		case 8: grade='B'; break;
		case 7: grade='C'; break;
		case 6: grade='D'; break;
		default : grade='F';
		}
		System.out.println(); //단순 줄바꿈
		//System.out.print("\n");  //print를 이용한 줄바꿈
		System.out.printf("총점 = %d%n",sum);
		System.out.printf("평균 = %.2f%n",avg);
		System.out.printf("등급 = %c%n", grade);
		input.close();
		
	}

}
