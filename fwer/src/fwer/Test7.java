package fwer;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		//땅 위 x미터 지점에서 보이는 지평선이 √{x(12800000+x)}미터  떨어진 곳이라고 가정하면, 땅 위 H미터 지점에서 보이는 지평선은 몇 미터 떨어져 있는지 구하라.
		
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		
		System.out.println(Math.sqrt(d * (12800000 +d)));

	}

}
