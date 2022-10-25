package day08.poly.instanceof_;
public class Employee extends Person {

	String department; //부서
	
	//생성자
	Employee(String name, int age, String department) {
		super(name, age);
//		super();
//		this.name = name;     //위와 같은 구문 생성자 연결해서 생성자가 가지고있는 값을 전달, 저장
//		this.age = age;
		this.department = department;
	}
	//오버라이딩
	String info() {
		//super.메서드() - 오버라이딩된 메서드에서 부모님의 원형메서드가 필요할때 사용가능
		return super.info() + ", 부서:" + department;
	}
	
}
