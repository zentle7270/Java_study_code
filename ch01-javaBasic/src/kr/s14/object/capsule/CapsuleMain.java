package kr.s14.object.capsule;

class Capsule{  //금고라고 생각하고 대신해줄수 있는 요소를 만들어서 접근할 수 있게끔 
				//메서드를 하나 만들어서 
	//private은 같은 클래스내에서만 접근 가능
	//은닉화
	private int a;  //private으로 하게 되면 접근 제한이 걸림
	//캡슐화
	public void setA(int n) {  //데이터는 setA를 통해서 세팅
		if(n>=0) {  
			a=n;
		}else {  //음수인것만 걸러내기
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	public int getA() {  //읽어온다
		return a;
	}
}
public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap=new Capsule();
		//변수 a의 접근 지정자(제한자)가 private이기 때문에 
		//같은 글래스애네서는 호출이 가능하지만 다른 클래스에서 호출 불가능
		/*cap.a = -10;   //정해진 데이터가 아닌 것도 들어가게 됨
		System.out.println(cap.a);*/
		cap.setA(100);  //데이터 저장
		System.out.println(cap.getA());  //데이터 호출
		
		cap.setA(-20);
		System.out.println(cap.getA());
	}
}
