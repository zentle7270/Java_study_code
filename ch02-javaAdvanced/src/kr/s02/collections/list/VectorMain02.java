package kr.s02.collections.list;
import java.util.Vector;

public class VectorMain02 {
	public static void main(String[] args) {
		Vector<Double> v = new Vector<Double>();
		//요소 추가
		v.add(100.3);
		v.add(3.14);
		v.add(1000.);//=1000.0
		
		//확장 for문을 이용한 요소의 출력
		for(Double n :v) {
			System.out.println(n);
		}
		//자원 검색
		double search = 1000.0; //검색할 요소
		int index = v.indexOf(search);//검색
		if(index !=-1) {
			System.out.println(("검색 요소 "+search+"의 위치 : "+index));
		}else {
			System.out.println("검색 요소"+ search+"가 없습니다.");
		}
		//자원 삭제
		double del = 3.14; //삭제할 요소
		if(v.contains(del)){
			v.remove(del);//삭제
			System.out.println(del + "삭제 완료!");
		}
	}
}
