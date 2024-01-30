package kr.s21.object.extention;
//부모 클래스
public class Phone {
	protected String number;
	protected String model;  //public한 메서드를 만들면 사용 가능
	protected String color;
	
	public String getNumber() {
		return number;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
}
