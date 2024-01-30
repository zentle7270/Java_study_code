package kr.s15.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {
	public static void main(String[] args) {
		FileReader fr = null;
		int readChar;
		try {
			//문자입력스트림
			fr=new FileReader("file.txt");
			//파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환
			while((readChar = fr.read())!=-1) { 
				System.out.println((char)readChar);//(char)를 하면 한글이 안깨짐
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fr!=null) try {fr.close();}catch(IOException e) {}
		}
	}
}
