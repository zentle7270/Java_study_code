package kr.s19.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLMain02 {
	public static void main(String[] args) {
		String address = "https://www.naver.com";
		BufferedReader br= null;
		String line;
		try {
			URL url = new URL(address);
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e ) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
