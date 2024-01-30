package kr.s12.iostream.file;
import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\"; //경로지정
		//경로를 파일 객체에 줌
		File f = new File(path);
		//if블럭으로 진입하지 않는 경우는 디렉터리일때 
		if(!f.exists() || !f.isDirectory()) {//존재하지도 않고 디렉터리도 아니면
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);//프로그램 종료
		}
		//지정한 경로의 하위 경로와 파일 정보를 File 배열로 반환
		File[] files = f.listFiles();
		for(int i=0;i<files.length;i++) {
			File f2 = files[i];
			//디렉터리인지 파일인지 알아내야함
			if(f2.isDirectory()) {//디렉터리
				System.out.println("["+f2.getName()+"]");
			}else {//파일
				System.out.print(f2.getName());
												//파일의 용량
				System.out.printf("(%,dbytes)%n",f2.length());
			}
		}
	}
}