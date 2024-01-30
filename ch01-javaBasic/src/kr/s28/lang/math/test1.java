package kr.s28.lang.math;

import java.util.Random;
public class test1 {
	public static void main(String[] args) {
		int[] lotto=new int[6];

		Random random = new Random();
		System.out.println("로또 번호 : ");
		for(int i=0; i<lotto.length;i++) {
			lotto[i]= (int)(Math.random()*45+1);
			for(int j=0;j<i;j++) {
				if(lotto[j]==lotto[i])
					i--;
			}
			System.out.print(lotto[i]+" ");
		}
	}
}
