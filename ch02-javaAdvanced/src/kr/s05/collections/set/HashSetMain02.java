package kr.s05.collections.set;

import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class HashSetMain02 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size()<6) { //사이즈가 6이 되면 빠져나오기
			int ir =(int)(Math.random()*45)+1;//1~45
			hs.add(ir); //중복값을 허용하지 않음     //조건 체크가 없어서 좋다.
		}
		System.out.println(hs);
		//HashSet -> set -> Collection 로 변경됨 
		ArrayList<Integer> list = new ArrayList<Integer>(hs);
		//위에는 ArrayList로 되어있고, sort는 List타입이다. 그래서 List타입을 위 코드에 미리 명시할 수 있다.
		//List<Integer> list = new ArrayList<Integer>(hs);
		
		//오름차순 정렬.   sort는 list타입으로 받아야 한다.
		Collections.sort(list);  //ArrayList를 sort한거다.
		
		//확장 for문을 이용한 요소 출력
		for(int num : list) {
			System.out.print(num+"\t");
		}
	}
}
