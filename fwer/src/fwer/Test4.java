package fwer;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
//		문제 설명
//		타카하시와 아오키는 조깅을 하기로 결정했다.
//		다카하시는 다음을  반복한다: "초속 B미터로 A초간 걷고 C초간 휴식한다.”
//		아오키는 다음을  반복한다: "초속 E미터로 D초 동안 걷고 F초 동안 휴식한다."
//		동시에 조깅을 시작한 지 X초가 지났을 때, 다카하시와 아오키 중 누가  앞서고 있는가?
		
//		출력:
//		동시에 조깅을 시작한 지 X초가 지났을 때, 다카하시가 아오키보다 앞서면 Takahashi를 인쇄하고,
//		아오키가 다카하시보다 앞서면 Aoki를 인쇄하고, 같은 거리를 전진하면 Draw를 인쇄한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(); //타카하시 걷는 시간
		int b = sc.nextInt(); //타카하시 초속
		int c = sc.nextInt(); //타카하시 쉬는 시간
		int d = sc.nextInt(); //아오키 걷는 시간
		int e = sc.nextInt(); //아오키 초속
		int f = sc.nextInt(); //아오키 쉬는 시간
		int x = sc.nextInt(); //총 시간
		
		sc.close();
		
		int q = x / (a + c); //루틴 반복 횟수
		int w = x % (a + c); //루틴 반복 후 나머지
		
		int t = x / (d + f); //루틴 반복 횟수
		int r = x % (d + f); //루틴 반복 후 나머지
		
		int taka = a* b * q;
		int aoki = d * e * t;
		
		if(w > a) {
			taka += b * a;
		} else {
			taka += b * w;
		}
		
		if(r > d) {
			aoki += e * d;
		} else {
			aoki += e* r;
		}
		
		if(taka > aoki) {
			System.out.println("Takahashi");
		} else if(taka < aoki) {
			System.out.println("Aoki");
		} else {
			System.out.println("Draw");
		}
		
	}

}
