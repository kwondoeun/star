package day01;

public class CastingEx01 {
	public static void main(String[] args) {
		
		byte b= 10;
		
		int s= b; //byte -> int 형으로 자동형변환
		short i= b; //byte -> short형으로 자동형변환
		long l= b; //byte -> long
		
		char c= '가';
		int j= c; //char -> int형으로 자동형변환
		System.out.println("가 의 유니코드 숫자값:" +j);
		
		int k= 1000;
		double d= k; //int -> double
		System.out.println(d);
	}
}
