package kr.s05.operation;

public class SwitchMain03 {
	public static void main(String[] args) {
		java.util.Scanner input= new java.util.Scanner(System.in);
		int score, grade;
		System.out.print("성적 입력>");
		score=input.nextInt();
	
		//조건 체크하기
		if(score<0 || score>100) {
			System.out.println("성적은 0~100만 입력 가능");
			System.exit(0);    // 프로그램 종료    
			//			->왜 넣었느냐? 음수이거나 100이 넘을때 switch 문이 돌면 안되므로 exit하기
		}
		
		switch(score/10){
		case 10:   //100
			grade = 'A'; break;  //break; 를 이 줄에다가 써도 된다
			
		case 9:     //90~99
			grade = 'A'; break;
		case 8:     //80~89
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:   	//60~69
			grade = 'D';
			break;
		default :	//0~59
			grade = 'F';
		}		
		System.out.println();//단순 줄바꿈
		System.out.printf("성적: %d%n", score);
		System.out.printf("등급: %c%n", grade);
		
		input.close();		
	}
}
