package quiz02;

public class Person {
	
	int age;
	String name;
	
	//프로그래머가 생성자를 인위적으로 생성하면, 기본생성자를 자동생성하지 않음
	//name과 age를 매개 변수로 받는 생성자(초기)
	Person() { //생성자를 하나 더 생성해줌
		
	}
	
	Person(String pName, int pAge) { //생성자의 역할
		name = pName;
		age = pAge;
	}
	
	String info() {
		String s = "이름:" + name +" "+ "나이:" + age;
		return s;
	}
	

}
