package fwer;
import java.util.Scanner;
public class Tset3 {
	public static void main(String[] args) {
		// 문제 설명
		//xy평면에 직사각형이 있다. 이 직사각형의 각 모서리는 x축 또는 y축과 평행을 이루며, 면적은 0이 아니다.
		//이 직사각형의 네 꼭짓점 중 세 꼭짓점, (x1,y1), (x2,y2), (x3,y3)의 좌표가 주어지면, 네번째 꼭짓점의 좌표를 구하라.

		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력하세요 > ");
		String row1 = scn.nextLine();
		String row2 = scn.nextLine();
		String row3 = scn.nextLine();
		
		int x1 = Integer.parseInt (row1.split(" ")[0]); //String의 배열 0번째 1번째 넣으면됨
		int y1 = Integer.parseInt (row1.split(" ")[1]); //String의 배열 0번째 1번째 넣으면됨
		
		int x2 = Integer.parseInt (row2.split(" ")[0]); //String의 배열 0번째 1번째 넣으면됨
		int y2 = Integer.parseInt (row2.split(" ")[1]); //String의 배열 0번째 1번째 넣으면됨
		
		int x3 = Integer.parseInt (row3.split(" ")[0]); //String의 배열 0번째 1번째 넣으면됨
		int y3 = Integer.parseInt (row3.split(" ")[1]); //String의 배열 0번째 1번째 넣으면됨
		
		//로직 처리

		int x4 = 0;
		int y4 = 0;
		
		if(x1 == x2) {
			x4 = x3;
		}else if(x1 == x3) {
			x4 = x2;
		} else {
			x4 = x1;
		}
		
		if(y1 == y2) {
			y4 = y3;
		}else if(y1 == y3) {
			y4 = y2;
		} else {
			y4 = y1;
		}
	
		//출력
		System.out.print(x4+" "+y4);
		
	}
}
