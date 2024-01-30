package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain08 {
	public static void main(String[] args) {
		ArrayList<CartItem> list= new ArrayList<CartItem>();
		list.add(new CartItem("A1001",2,20000));   //생성자를 통해 데이터 셋팅함
		list.add(new CartItem("B1001",1,70000));
		list.add(new CartItem("C1001",3,2500));
		
		//ArrayList의 요소를 반복문을 이용해서 출력
		System.out.printf("%s %8s %8s%n", "상품코드","수량","가격");
		System.out.println("--------------------------------");
		for(CartItem item : list) {
			System.out.printf("%s %,8d %,8d%n", item.getCode(),item.getNum(),item.getPrice());
		}
	}
}
