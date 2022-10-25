package day09.inter.basic3;

public class PetHouse {

	//1. IPet타입을 매개변수로 받아서 기능을 출력하는 static메서드
	public static void method1(IPet p) {
		p.play();
	}
	//2. IPet[] 타입을 매개변수로 받아서, 배열 내부 Pet들의 play기능을 실행
	public static void method2(IPet[] arr) {
		for(IPet i : arr) {
			i.play();
		}
	}
}
