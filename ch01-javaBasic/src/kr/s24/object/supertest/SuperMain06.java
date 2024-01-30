package kr.s24.object.supertest;

//부모 클래스
class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//메서드
	public String getLocation() {
		return "x:"+x+",y:"+y;
	}
}
//자식 클래스
class Point3D extends Point{
	int z;
	public Point3D(int x, int y,int z) { //인자 z값은 19번째줄 z에 넣어줘야 하니까 this사용
		super(x,y); //부모클래스에 올려서 처리되게 한돠.
		this.z=z;  
	}
	//메서드 오버라이딩
	@Override
	public String getLocation() {  //재정의
		return "x:"+x+", y:"+y+", z:"+z;
	}
}
public class SuperMain06 {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Point3D p3=new Point3D(100,200,300);
		//getLocation 메서드 호출
		System.out.println(p3.getLocation());
	}
}
