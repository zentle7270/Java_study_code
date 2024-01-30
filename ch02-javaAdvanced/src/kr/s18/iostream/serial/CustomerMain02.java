package kr.s18.iostream.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.IOException;

public class CustomerMain02 {
	public static void main(String[] args) {
		System.out.println("===객체 역직렬화===");
		FileInputStream fis= null;
		ObjectInputStream ois=null;
		try {
			fis = new FileInputStream("object.ser");
			ois = new ObjectInputStream(fis);
			
			//역직렬화 수행 
			Customer c = (Customer)ois.readObject();//(Customer)를 해서 다운캐스팅해준다.  
			System.out.println(c);  //toString이 동작되면서 당신의 이름은 홍길동이 출력될거다
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(ois!=null)try {ois.close();}catch(IOException e) {}
			if(fis!=null)try {fis.close();}catch(IOException e) {}
		}
	}
}
