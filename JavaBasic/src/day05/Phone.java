package day05;
public class Phone {
	//멤버변수 선언
	String model;
	int price;
	String color;
	//생성자
	//1. 클래스가 객체로 처음 생성될때 불려나가는 친구
	//2. 이름은 클래스명과 동일
	//3. 생성자를 만들지 않으면 자동으로 생성
	Phone() {
		System.out.println("생성자 호출됨");
		model = "애니콜";
		price = 1000;
		color = "빨강";
	}
	//생성자는 여러개일 수 있습니다. 단, 모형이 달라야함
	Phone(String pModel) {
		model = pModel;
		price = 2000;
		color = "블루";
	}
	Phone(String pModel, int pPrice) {
		model = pModel;
		price = pPrice;
		color = "블랙";
	}
	Phone(int pPrice, String pModel) { //순서가 바뀌더라도 가능, 타입을 중요시하기 때문
		model = pModel;
		price = pPrice;
		color = "화이트";
	}
	Phone(String pModel, int pPrice, String pColor) {
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	//메서드생성
	void info() {
		System.out.println("===폰의 정보===");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
		
	}
}
