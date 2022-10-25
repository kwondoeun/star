package api.lang.object;

public class MainClass {
	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		//toString()
//		String result = p.toString(); //오버라이딩을해서 멤버변수 값을 확인하는데에 사용
//		System.out.println(result);
		System.out.println(p.toString()); //반환ok
		
		//equals()
		Person p2 = new Person("홍길동");
//		System.out.println(p.equals(p)); //true
		System.out.println(p.equals(p2)); 
		
		//clone() - 객체복사
		
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			
			System.out.println(p3 == p); //두개는 다른객체인데, 완전히 같은 새로운객체 생성
			
			System.out.println("복사된객체의name:" + p3.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
