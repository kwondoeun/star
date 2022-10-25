package api.lang.system;

import java.io.PrintStream;

public class SystemEx {
	
	public static void main(String[] args) {
		
		System.out.println("출력");
		
		//System.exit(0);
		//System.gc(); //void형이므로 그냥 실행만 시킬수있음
		
		long start = System.currentTimeMillis();
		//System.out.println(start); //1970/1/1 이후의 현재까지의 지나온 시간을 밀리초로 표현
		
		long sum = 0;
		for(long i = 1; i < 10000000000L; i++) {
			sum+=i;
		}
		
		long end = System.currentTimeMillis();
		//System.out.println(end);
		
		System.out.println((end - start) * 0.001 + "초 소요됨");
		
	}

}
