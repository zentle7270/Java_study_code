package kr.s06.collections.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		/*
		 * Map : key와 value의 쌍으로 저장
		 */
			   // key   value
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		//key와 value의 쌍으로 저장
		map.put("김신", 95);
		map.put("지은탁", 100);
		map.put("저승사자", 85);
		map.put("써니", 93);
		map.put("유덕화", 70);
		//key와 value에 null 인정
		map.put("홍길동", null);
		map.put(null, 100);
		map.put("지은탁", 0); //같은 key를 사용하면 value를 덮어씌움
		
		//저장된 key,value 목록 출력
		System.out.println(map);
		System.out.println("-------------------");
		
		//키를 통해 값을 구해보자.
		
							// key
		Integer num = map.get("지은탁"); //지은탁의 점수를 Integer로 뽑아낸거다
		System.out.println("지은탁의 성적은 "+ num); 
		/*
		Integer num1 = map.get("홍길동"); //지은탁의 점수를 Integer로 뽑아낸거다
		System.out.println("홍길동의 성적은 "+ num1);
		
		Integer num2 = map.get(null); //지은탁의 점수를 Integer로 뽑아낸거다
		System.out.println("null의 성적은 "+ num2);
		*/
	}
}
