package fwer;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		/*
		문제 설명
		어떤 프로그래밍 대회에서, 티셔츠가 다음 규칙에 따라 참가자들에게 수여된다.
		A위 또는 그 이상의 순위에 오른 모든 참가자는 티셔츠를 받는다.
		추가적으로, (A+1)위부터 B위(포함)에 오른 참가자 중에서 균등하게 무작위로 뽑힌 C명의 참가자들은 티셔츠를 받는다.

		이번 대회에는 1000명이 참가했고, 모두 순위가 달랐다.
		이번 대회에 참가한 이로하짱은 X위에 올랐다.
		그녀가 티셔츠를 받을 확률을 구하라.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		 
		 double answer = 0;
		 
		 if(x <= a) {
			 answer = 1;
		 } else if (x > a && x <= b) {
			 answer = (double) c / (b-a);
		 } else {
			 answer = 0;
		 }		 
		 System.out.println(answer);
	}

}
