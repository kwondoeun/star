package day08.poly.basic2;
public class Person { //부모클래스로 사용

	String name;
	int age;
	//기본생성자
//	Person() {
//		this("홍길동",1); //this()를 사용하여 생성자를 연결, 두개짜리 생성자 호출
//	}
	
	Person(String name) {
		this(name, 1);  //두개짜리 생성자 호출
	}
	
	Person(String name, int age) {
		super();
		this.name = name.toUpperCase();
		this.age = age;

	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
	
}
