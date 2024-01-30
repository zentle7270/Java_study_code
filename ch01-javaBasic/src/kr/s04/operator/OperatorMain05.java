package kr.s04.operator;

public class OperatorMain05 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);  //입력 작업 시작
		
		System.out.print("국어:");
		//입력된 정수를 변수에 대입
		int korean = input.nextInt();  //입력하면 nextInt가 korean에 대입해줌. 
		
		System.out.print("영어:");
		int english = input.nextInt();    //nextInt는 정수만 가능
		
		System.out.print("수학:");
		int math = input.nextInt();  
		
		//총점 구하기
		int sum = korean+ english+ math;
		//평균 구하기
		//double avg= sum / 3;     //int avg= sum / 3;  => 2개다 소수점이 0으로 나옴  35.00 이런식으로
		  //sum과 3이 int 형이기 때문에
		//double 데이터로 만들고 싶으면 참여하는 연산 중 하나를 double로 하면 됨
		// ex) 10.0 / 3    
		double avg = sum / 3.0;     //  중요 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		System.out.printf("국어 = %d%n", korean);
		System.out.printf("영어 = %d%n", english);
		System.out.printf("수학 = %d%n", math);
		System.out.printf("총점 = %d%n", sum);
		//System.out.printf("평균 = %d%n", avg);
		System.out.printf("평균 = %.2f%n", avg);
		input.close(); //입력 작업 끝
	}
}
