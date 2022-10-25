package quiz02;

public class MainClass {
	public static void main(String[] args) {
		
		/*
		 * Person클래스를 파일로 정의
		 * 
		 * 멤버변수는 int age, String name
		 * 메서드 info() : String - 멤버변수를 문자열로 더해서 반환
		 * 
		 * 메인에서는 Person 객체를 2개 생성해서 각각 확인
		 */
		
		//1. 객체생성
		Person person = new Person();
		//2. .로 사용
		person.name = "훈";
		person.age = 23;
		String s = person.info();
		System.out.println(s);
		
		Person person2 = new Person();
		person2.name = "권";
		person2.age = 33;
		String s1 = person2.info();
		System.out.println(s1); //s1 대신 person.info()도 가능
		
		Person person3 = new Person("홍길동", 40);
		String s2 = person3.info();
		System.out.println(s2);
		////////////////////////클래스////////////////////////////////
		//멤버변수, 메서드, 생성자를 사용해서
		//현실에 찾아볼 수 있는 물건 생각해서 클래스 표현
		//생성해서 사용
		
		Car car = new Car();
		car.info();
		
		Car car1 = new Car("기아", "k5");
		car1.info();
		
		Car car2 = new Car("AMG", "벤츠", "회색");
		car2.info();
		
		System.out.println();
		///////Tv
		
		Tv tv = new Tv();
		
		tv.power();
		tv.changeCh(10);
		tv.power();
	}

}
