package kr.s01.basic;
public class PrintMain05 {
	public static void main(String[] args) {
		//System.out.prinf(포맷문자,데이터)를 이용한 출력
		//(데이터의 종류를 표시할 수 있는 포맷문자 지원)
		
		//문자
		System.out.printf("%c%n",'A');      //줄바꿈
		System.out.printf("%6c%n", 'B');     //6자리 확보, 오른쪽에 정렬
		System.out.printf("%-6c%n", 'C');   //6자리 확보, 왼쪽에 정렬
		System.out.println("==============");
		
		//정수
		System.out.printf("%d%n", 67);
		System.out.printf("%5d%n", 8);   //5자리 확보, 오른쪽에 정렬
		System.out.printf("%-5d%n", 3);  //5자리 확보, 왼쪽에 정렬
		System.out.printf("%,d원%n", 100000); //3자리 단위로 쉼표를 표시 -> %와 d 사이에 쉽표 넣기 
		System.out.println("==============");
		//실수
		System.out.printf("%f%n", 35.896);  //%f는 소수점 자리 6자리 확보, 비어 있는 자리는 0으로 채움. 
											//그래서 결과값이 35.896000 으로 나옴.
		
		System.out.printf("%.2f%n", 35.896); // 소수점 둘째 자리까지 출력(셋째자리에서 반올림)
		System.out.printf("%10.2f%n", 35.896); //10은 전체자리수를 뜻함. 10자리를 확보하고 오른쪽부터 표시, 
												//소수점 둘째자리까지 출력
		System.out.println("=============");
		
		//문자열
		System.out.printf("%s%n", "우주"); 
		System.out.println("=============");
		
		//논리값
		System.out.printf("%b%n", true);
		System.out.println("=============");
		
		//데이터의 종류가 여러개일 경우
		System.out.printf("%s는 %d점입니다.", "점수",98);
		
	}
}
