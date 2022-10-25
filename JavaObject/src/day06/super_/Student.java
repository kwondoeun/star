package day06.super_;

public class Student extends Person {

	String studentId; //학번
	
	Student(String name, int age, String studentId) {
		super(name,age);
		this.studentId = studentId;
	}
	
	//오버라이딩
	String info() {
		return super.info() + ", 학번" + studentId;
	}
	
}
