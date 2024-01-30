package kr.s17.object.trainning;
import kr.s17.object.trainning.Animal;

public class AnimalMain {
	/*
	 * [실습]
	 * 1. 객체 생성 : 인자가 있는 생성자로 객체 생성 (name,age,fly를 이용해서 먼저 객체를 생성) 데이터를 넣겠지. 기러기는 3살이고 날 수 있다. 
	 * 2. 생성된 객체의 멤버 변수에 저장된 정보 출력
	 *    이름: 기러기
	 *    나이: 3살
	 *    비행 여부: 가능  (조건 체크해서 true일때 가능 flase일때 불가능)
	 * 3. 객체 생성: 인자가 없는 생성자로 객체 생성
	 * 4. 이름, 나이 , 비행 여부를 저장
	 * 5. 생성된 객체의 멤버 변수에 저장된 정보 출력
	 * 		이름 : 기린
	 * 		나이: 10살
	 * 		비행 여부 : 불가능
	 */
	public static void main(String[] args) {
		Animal a1=new Animal("기러기",3,true);
		System.out.println("이름 : "+ a1.getName());  
		System.out.println("나이 : "+ a1.getAge()+"살"); 
		System.out.println("비행여부 : "+ (a1.isFly() ? "가능" : "불가능")); 
		
		//인자가 없는 생성자를 이용해서 객체 생성   name이 private이기 때문에 직접 호출 못함
		Animal a2 = new Animal();
		a2.setName("기린");
		a2.setName("10");
		a2.setName("false");
		
		System.out.println("이름: "+a2.getName());
		System.out.println("나이 : "+ a2.getAge()+"살"); 
		System.out.println("비행여부 : "+ (a2.isFly() ? "가능" : "불가능")); 
	}
}
