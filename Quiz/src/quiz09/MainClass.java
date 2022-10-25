package quiz09;
public class MainClass {
	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("대한항공");
		
		ap.takeOff(); //상속
		ap.fly(); //오버라이딩
		ap.flymode = 1;
		ap.fly();
		ap.land(); //상속
		
		System.out.println(ap.info());
		
	}

}
