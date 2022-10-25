package quiz04;
public class Player { //부모에는 변수 선언만, field/method/construct 3개면 만들기 가능
	
	String name;
	int hp;
	int mp;

	//메서드
	void info() {
		System.out.println("케릭명:" + name);
		System.out.println("hp:" + hp);
		System.out.println("mp:" + mp);
	}
}
