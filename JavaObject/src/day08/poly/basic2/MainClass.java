package day08.poly.basic2;
import java.util.Arrays;
public class MainClass {
	public static void main(String[] args) {
		
		//다형성을 적용한 배열
		Student s = new Student("홍길동", 20,"123123");
		
		Teacher t = new Teacher("홍길자", 30, "프로그램");
		
		Employee e = new Employee("홍길순", 30, "취업지원팀");
		
		//Object[] arr = {s, t, e}; //변수명으로 담기 //obj는 오버라이딩을 못함
		Person[] arr = {s, t, e}; 
		
		for(Person p : arr) {      //1번결과
			System.out.println(p.info()); //자식이 오버라이딩 된 메서드가 실행
		}
	
		//House객체 생성
		House house = new House();
		house.setPerson(s); //스튜던트 저장
		house.setPerson(t); //스튜던트 저장
		house.setPerson(e); //스튜던트 저장
		
		Person[] ar= house.getArr();
		System.out.println(Arrays.toString(ar));
		
		for(Person p : ar) {      //1번결과
			if(p == null) break;
			System.out.println(p.info()); //자식이 오버라이딩 된 메서드가 실행
		}
	}
	
}
