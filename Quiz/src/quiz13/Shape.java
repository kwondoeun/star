package quiz13;
public abstract class Shape {

	private String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	//오버라이딩을 강제화 한다면 추상메서드로 선언
	public abstract double getArea();  //추상메서드는 오버라이딩이 돼야함
	
	//오버라이딩을 강제화 하지않는다면 일반메서드로 선언
	public String getName() {
		return "도형이름:" + name;  //추상메서드가 아니니 굳이 오버라이딩 하지 않아도됨
	}

}
