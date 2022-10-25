package day07.encap.obj;
public class Hotel { //사용자 클래스
	
//	public String str; //파란색 멤버변수
	private Chef chef; // = new Chef();
	
	//기본생성자
	public Hotel() {}
	
	//생성자 - 클래스를 받는 생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//getter, setter
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() { //Chef타입을 반환하는 메서드
		return chef;
	}	
}
