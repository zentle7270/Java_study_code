package kr.s19.object.array;
import java.util.Scanner;



public class ScoreMain {
	/*
	 * [실습]
	 * 1. Scanner 객체 생성
	 * 2. 배열의 길이 4인 scoreArray 배열 생성
	 * 3. 변수 전체 과목 총점(total), 전체 과목 평균(avg)
	 * 4. Score 객체를 4개 생성해서 배열에 저장
	 *     이름, 국어, 영어 , 수학 점수 입력 받아서 객체에 저장하시오.  
	 * 5. 반복문을 이용한 객체의 멤버 변수 값 출력
	 *     이름, 국어, 영어 , 수학 ,총점, 평균, 등급
	 * 6. 전체 과목 총점, 전체 과목 평균  (안해도 됨) 
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Score[] sc=new Score[4];
		int total=0;   //전체 과목 합계
		int avg=0;     //전체 과목 평균
		//score 객체를 4개 생성해서 배열에 저장
		for(int i=0;i<sc.length;i++) {
			System.out.print("이름 > ");
			String name= input.nextLine();
			
			System.out.println("국어> ");
			int korean=input.nextInt();
			
			System.out.println("영어> ");
			int english=input.nextInt();
			
			System.out.println("수학>" );
			int math=input.nextInt();
		
			input.nextLine(); //enter를 훕수하는 역할 . 오동작을 해결하기 위해서
			//이걸 안해주면 엔터를 딱 칠대 이름 부분이 입력이 안되고 국어가 나온다. 
			sc[i]=new Score(name,korean,english,math);
			System.out.println("--------------------");
		}
		//4명의 국어,영어,수학,총점,평균,등급을 출력
		for(Score s : sc) {
			System.out.printf("%s\t",s.getName());
			System.out.printf("%d\t",s.getKorean());
			System.out.printf("%d\t",s.getEnglish());
			System.out.printf("%d\t",s.getMath());
			System.out.printf("%d\t",s.makeSum());
			System.out.printf("%d\t",s.makeAvg());
			System.out.printf("%s\n",s.makeGrade());
		//전체 과목 총점
			total+=s.makeSum();
		}
		//전체 과목 평균
		avg=total/(sc.length*3);
		System.out.println("----------------");
		System.out.printf("전체 과목 총점 : %d, 전체 과목 평균 %d",total,avg);
		input.close();
	}
}

