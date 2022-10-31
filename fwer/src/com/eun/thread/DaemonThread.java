package com.eun.thread;

public class DaemonThread {

	public static void main(String[] args) {
		//1부터 10까지를 1초씩 딜레이 하면서 출력해주는 스레드
		Thread th = new Thread(()-> {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println(i);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		//데몬 스레드로 설정 - 다른 작업이 없으면 자동으로 종료
		th.setDaemon(true); // 이 줄이 없으면 위의 스레드는 계속 실행함.
		th.start();
		
		try {
			Thread.sleep(3000);
			System.out.println("메인 종료");
		} catch (Exception e2) {}

	}

}
