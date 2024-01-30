package kr.s11.object.method;

public class MethodArgMain03 {
	//Variable Arguments 
	//자료형이 일치할 때 전달하고자 하는 값의 개수를 다르게 지정할 수 있음.
	//전달하는 데이터는 내부적으로 배열로 인식함
	public void argTest(int ... n) { //(...) 만약 n에 10을 넣게되면 배열에 10이 들어감. 
									//10,20을 넘기면 방이 하나 더 만들어져서 10,20 들어감. 
		for(int i=0; i<n.length;i++) {
			System.out.println("n["+i+"]:"+n[i]); 
		}
		System.out.println("---------------------");
	}
	public static void main(String[] args) {
		MethodArgMain03 me = new MethodArgMain03();
		me.argTest();	//데이터를 넣지 않아도 메서드는 호출된다. 
			//배열은 만들어지는데 length가 0이어서 반복하지 않고 바로 내려와서 구분선만 출력됨
		me.argTest(10);     //10이 n에 전달됨. n은 배열을 만들어서 전달된 10을 넣어버림. 
		me.argTest(10,20);  
		me.argTest(10,20,30); //배열로 처리하기 때문에 자료형이 일치해야한다
	}
}
