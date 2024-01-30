package kr.s17.object.trainning;
public class Animal {
	/*  fly boolean
	 * [실습]
	 * 1. 멤버 변수 : 이름(name), 나이(age), 비행 여부(fly)   => private으로 만들기
	 * 2. 생성자 지정: 인자 없는 생성자, 인자가 있는 생성자(name,age,fly)
	 * 3. set/get 지정: 멤버 변수를 private 지정하고 public한 set/get 메서드 정의
	 * 
	 */
	private String name;//이름
	private int age;//나이
	private boolean fly;//비행 여부 
	
	//생성자 오버로딩
	public Animal() {}    //인자가 없는 생성자   //기본 작업만 수행함
	public Animal(String name,int age, boolean fly) {  //인자 이름을 일부러 동일하게 함. 
		//멤버 변수   지역변수  
		this.name =name;
		this.age =age;
		this.fly=fly;
	}

	//캡슐화 
	public void setName(String name) {  //데이터 넣을 때 
		this.name=name;
	}
	public String getName() {    //데이터 반환받을 때 
		return name;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public int getAge() {
		return age;
	}
	public void setFly(boolean fly) {
		this.fly =fly;
	}
	public boolean isFly() {  //boolean에서는 get보다는 is를 많이 사용한다.
		return fly;
	}
}
