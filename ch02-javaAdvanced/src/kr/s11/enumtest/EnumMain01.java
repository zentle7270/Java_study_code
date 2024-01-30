package kr.s11.enumtest;

public class EnumMain01 {
	//enum을 사용하지 않고 static 상수를 사용한 경우
	public static final String JAVA = "JAVA";
	public static final String JSP = "JSP";
	public static final String ORACLE = "ORACLE";

	public static void main(String[] args) {
		System.out.println(JAVA);//원칙적으로 EnumMain01.JAVA로 해야하는데 같은 클래스여서 생략가능
		System.out.println(JSP);
		System.out.println(ORACLE);
	}
}
