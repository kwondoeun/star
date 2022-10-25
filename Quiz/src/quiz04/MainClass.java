package quiz04;
public class MainClass {
	public static void main(String[] args) {
		
		Warrior war = new Warrior("전사");
		war.bash();
		war.bash();
		war.info();
		
		Wizard wi = new Wizard("마법사");
		wi.iceArrow();
		wi.iceArrow();
		wi.info();
	}

}
