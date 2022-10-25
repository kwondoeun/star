package quiz13;
public class Rect extends Shape{
	//사각형은 생성될 때 이름과, 변의 길이를 받도록 처리하고,
	//getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인
	private int side;
	
	Rect(String name, int side) { //생성될 때 이름, 변의 길이를 받도록 처리하라했으니 매개변수지정
		super(name); //부모님것이니 super
		this.side = side; //내것이니 this
	}
	@Override
	public double getArea() {
		return side * side;
	}
}
