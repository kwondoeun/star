package day06.override;
public class Child extends Parent {
	//아래 5번째줄 초록색 삼각형 오버라이딩을 주었다는 뜻임
	//오버라이딩 된 메서드
	int method02() { //오버라이딩 -> 덮어쓰기
		System.out.println("자식의 오버라이딩 된 2번 메서드");
		return 100;
	}
	
	//자신의 메서드
	void method03() {
		System.out.println("자식의 3번 메서드");
	}

}
