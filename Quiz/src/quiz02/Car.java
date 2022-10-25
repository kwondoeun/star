package quiz02;

public class Car {
	
	String company;
	String name;
	String color;
	int price;
	
	Car() {
		company = "현대";
		name = "그랜저";
		color = "검정";
		price = 2000;
	}
	
	Car(String tCompany,String tName) {
		company = "기아";
		name = "k5";
		color = "빨강";
		price = 2500;
	}
	
	Car(String tName,String tCopany,String tColor) {
		company = "벤츠";
		name = "AMG";
		color = "회색";
		price = 8500;
	}
	void info() {
		System.out.println("===폰의 정보===");
		System.out.println("회사:" + company);
		System.out.println("상품명:" + name);
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
		
	}
	
	
}
