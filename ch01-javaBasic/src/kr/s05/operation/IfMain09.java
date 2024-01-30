package kr.s05.operation;

public class IfMain09 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 생년월일을 입력하고 만 나이를 출력하는 프로그램을 작성하시오.
		 * 만나이=(현재 연도 - 태어난 연도) - (생일이 지났으면 0, 생일이 지나지 않았으면 1)
		 * [입력 예시]
		 * 출생연도 입력:2000
		 * 월 입력:3
		 * 일 입력 12
		 * [출력 예시]
		 * 만 나이는 23
		 * 
		 */
		//현재 날짜 정보
		int thisYear=2023;
		int thisMonth=9;
		int thisDate=4;
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("출생연도 입력:");
		int byear= input.nextInt();
		
		System.out.print("월 입력:");
		int bmonth= input.nextInt();
		
		System.out.print("일 입력:");
		int bday= input.nextInt();
		//현재 연도와 태어난 연도 연산
		int age=thisYear- byear;
		//현재 월과 태어난 월을 비교 
		
		if(thisMonth<bmonth) { //예: 9 <10
			age--;
		}else if(thisMonth==bmonth && thisDate<bday){
			//현재 월과 태어난 월이 같으면 일 비교 예) 4 < 30
			age--;
		}else {
			//생일이 지난 경우이기 때문에 age의 변동이 없음. 그래서 
			//else를 명시할 필요가 없음
			System.out.println("~~~~~~~~");
		}
		System.out.printf("만 나이는 %d%n",age);
		
		
		/*
		if(thisMonth>bmonth) {
			System.out.println("만 나이는 "+age);
		}else if (thisMonth<bmonth) {
			System.out.println("만 나이는 "+(age-1));
			
		}else if(thisMonth==bmonth && thisDate>=bday){
			System.out.println("만 나이는 "+age);
		}
		else if(thisMonth==bmonth && thisDate<bday){
			System.out.println("만 나이는 "+(age-1));
		}
		else {
			System.out.println("입력이 잘못되었습니다");
		}
		*/
		input.close();
	}
}
