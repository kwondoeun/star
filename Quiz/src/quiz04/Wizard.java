package quiz04;
public class Wizard extends Player{ //자식한테는 값을 넣어줌
 	//Player클래스로 상속관계를 만들어 주세요
	//마법사는 생성될 때 ★이름만 매개변수로 받고, hp = 50, mp = 100이 됩니다.
	//마법사는 강력한 iceArrow()를 가지고 있습니다
	//iceArrow()는 호출될떄마다 mp를 -20씩 감소시킵니다
	
	Wizard(String n) {
		name = n;
		hp = 50;
		mp = 100;
	}

	void iceArrow() {
		System.out.println("얍");
		mp = mp - 20; //mp-=20
		System.out.println("스킬을 사용합니다");
		System.out.println("mp가 20씩 감소합니다");
		System.out.println("현재 mp=" + mp);
	}
}
