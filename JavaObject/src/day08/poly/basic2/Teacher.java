package day08.poly.basic2;
public class Teacher extends Person{
	
	String subject; //과목
	
	//생성자
	Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	//오버라이딩
	String info() {
		return super.info() + ", 과목:" + subject;
	}
}
