package kr.s19.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content");
			
			System.out.println("프로토콜 : "+ url.getProtocol());
			System.out.println("호스트 : "+ url.getHost());
			System.out.println("포트 : "+ url.getPort());//포트를 url에 명시를 안했기 때문에 -1이라고 출력됨
			System.out.println("기본 포트 : "+url.getDefaultPort());//80 출력됨
			System.out.println("패스 : "+url.getPath());
			System.out.println("쿼리 : " + url.getQuery());
			System.out.println("ref : " + url.getRef());
			
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
}
