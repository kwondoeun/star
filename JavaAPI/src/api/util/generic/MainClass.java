package api.util.generic;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		//ABC<String> abc = new ABC<String>();
		//ABC<Integer> abc = new ABC<Integer>();
		ABC<String> abc = new ABC<>(); //뒤의 <>는 생략 가능, 일반 타입은 사용 못함.

		abc.setAbc("gg");
		
		String s = abc.getAbc();
		
		ArrayList<String> a = new ArrayList<>();
	}

}
