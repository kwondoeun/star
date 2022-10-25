package day01;

public class CastingEx02 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할때 (type) 캐스팅을 이용해서 명시적 형변환을 해야함
		 */
		
		int i= 70;
		char c= (char)i;
		short s= (short)i;
		
		double d= 3.14;
		int k= (int)d;
		
		System.out.println(k);
		
		/*
		 * 캐스팅을 할때 주의할 점
		 * 해당 값을 받을 수 없는 범위가 들어오면 잘려나간 값(쓰레기값)이 저장됨
		 */
		int a= 1000;
		byte b= (byte)a;
		System.out.println(b); //= -24
		
		/*
		 * char, short는 크기가 같지만 문자형과 숫자형이기 때문에, 형변환이 필요
		 * 
		 */
		
		char cc= 'A';
		short ss= (short)cc;
	
	}
}
