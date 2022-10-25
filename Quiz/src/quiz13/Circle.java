package quiz13;
public class Circle extends Shape{ //abstract를 쓰면 부모나 circle이나 사용하지못함(객체생성x)

	//원은 생성될 때 이름과, 반지름의 길이를 받도록 처리하고,
	//getArea()는 원의 넓이를 계산하도록 오버라이딩 처리
	//main에서 확인
	private int radius;
	
	Circle(String name, int radius) { //생성자의 모형
		super(name);  //name은 부모것을 빌린것
		this.radius = radius; //내것이니 this 사용
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
