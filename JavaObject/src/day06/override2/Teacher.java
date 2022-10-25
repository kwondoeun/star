package day06.override2;

public class Teacher extends Person{

	String subject; //과목
	//오버라이딩
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
