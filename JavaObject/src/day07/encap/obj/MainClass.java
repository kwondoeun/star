package day07.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		
		//호텔 클래스 사용
		Hotel hotel = new Hotel();
		
		//hotel.setChef(new Chef()); //아래 10,11라인과 동일한 내용
		Chef chef = new Chef();  //변수명으로 타입을 받아 넣어주면됨.
		hotel.setChef(chef);
		
		//getter
		Chef c = hotel.getChef();
		c.cooking();
		
		System.out.println(chef == c);
		
		
	}

}
