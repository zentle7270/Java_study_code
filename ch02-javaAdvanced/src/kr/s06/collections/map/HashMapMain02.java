package kr.s06.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Paris","Seoul","New York","London"};
			//   key     value
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//HashMap에 key와 value 저장
		for(int i=0; i<msg.length;i++) {
			map.put(i, msg[i]);
		}
		//저장된 key,value 목록을 출력
		System.out.println(map);
		System.out.println("-----------------");
		
		//Set<Integer> s = map.keySet(); //가지고 있던 키들을 다 복사해줌 
		//Iterator<Integer> keys= s.iterator();
		Iterator<Integer> keys = map.keySet().iterator();//iterator객체가 만들어지고 키를 다 복사해서 가져온다
		
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key + "," + map.get(key));
		}
	}
}
