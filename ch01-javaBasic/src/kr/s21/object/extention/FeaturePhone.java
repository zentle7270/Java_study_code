package kr.s21.object.extention;

public class FeaturePhone extends Phone { 
	//사진을 찍을 수 있는 기능
	private int pixel; //사진 화소수
	
	public FeaturePhone(String number,String model,String color,int pixel) {
		this.number=number;  //number, model,color가 부모 클래스에 있으므로 상속하기
		this.model=model;
		this.color=color;
		this.pixel=pixel;
	}
	public int getPixel() {
		return pixel;
	}
}
