package kr.s18.iostream.serial;

import java.io.Serializable;
/*
 * Serializable 인터페이스를 구현하면 해당 클래스는 객체 직렬화 대상이 되어 
 * 언제든지 객체 직렬화를 수행할 수 있음. 
 * 미구현시 객체 직렬화 불가능
 */
public class Customer implements Serializable { //직렬화하기 위한 
	private String name; //직렬화 대상
	
	//클래스명, 멤버변수명, 멤버변수에 저장되어 있는 데이터만 직렬화 대상. 
	//이 줄 밑으로는 직렬화 대상이 아니다. 
	public Customer(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "당신의 이름은 " + name;
	}
}
