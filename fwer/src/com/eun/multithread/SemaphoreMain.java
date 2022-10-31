package com.eun.multithread;

import java.util.concurrent.Semaphore;

public class SemaphoreMain {

	public static void main(String[] args) {
		//2개씩 실행할 수 있는 세마포어
		Semaphore semaphore = new Semaphore(3);
		
		Thread th1 = new Thread(new SemaphoreThread("나루토", semaphore));
		Thread th2 = new Thread(new SemaphoreThread("쇼콜라", semaphore));
		Thread th3 = new Thread(new SemaphoreThread("피에르", semaphore));
		Thread th4 = new Thread(new SemaphoreThread("블랑카", semaphore));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}

}
