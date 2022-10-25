package quiz13;
public class MainClass {
	public static void main(String[] args) {
		
		Shape c = new Circle("동그리", 3); //Circle c = new Circle("동그리", 3);와 동일
		System.out.println(c.getName());  //상속
		System.out.println(c.getArea());  //오버라이딩
		
		Shape r = new Rect("네모", 4);
		System.out.println(r.getName());  //상속
		System.out.println(r.getArea());  //오버라이딩	
	}
}
