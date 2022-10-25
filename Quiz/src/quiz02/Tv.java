package quiz02;
public class Tv {
	
	String company;
	int ch;
	boolean power;
	
	//생성자
	Tv() {}
	
	Tv(String a, int b, boolean c) {
		company = a;
		ch = b;
		power = c;
	}
	
	//메서드
	boolean power() {
		if(power) {
			System.out.println("전원off");
			power = false;
		} else {
			System.out.println("전원on");
			power = true;
		}
		return power;
	}
	
	//채널변경
	int changeCh(int num) {
		ch =  num; //채널변경
		System.out.println(ch + "번 변경");
		return ch;
	}
}
