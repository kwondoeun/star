package day09.inter.basic;

public class MainClass {
	public static void main(String[] args) {
		
		//인터페이스는 객체생성이 불가합니다.
		//Inter1 i1 = new Inter1();
		
		//인터페이스도 부모타입이 될 수 있습니다.	
		//Inter1의 기능만 사용하고, override된 메서드
		//Inter1 b = new Basic();
		//b.method01();
		//b.method02();
		
		////////////////////////
		Basic b = new Basic();
		b.method01();
		b.method2();
		///////////////////////
		Inter2 i2 = b; //클래스 형변환
		i2.method2();
		///////////////////////
		Basic bb = (Basic)b; //클래스 형변환
	}

}
