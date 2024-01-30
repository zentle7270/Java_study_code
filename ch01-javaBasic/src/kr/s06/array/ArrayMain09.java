package kr.s06.array;

public class ArrayMain09 {
	public static void main(String[] args) {
		//전달되는 데이터는 모두 문자열로 인식하기 때문에
		//덧셈을 하지 못하고 문자열 연결을 수행함
		System.out.println(args[0]+args[1]);   //출력값 1020 이다. 
		System.out.println("---------------------");
		
		//위 코드는 출력값이 1020이 나오므로 
		//String -> int변환  (함수의 도움을 받아야함) 
		//Integer.parseInt가 string을 int로 변환하는 역할
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		System.out.println("합계 : " + (num1+num2));   //10,20 입력 후 30 출력
	}
}