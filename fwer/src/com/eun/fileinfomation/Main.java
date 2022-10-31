package com.eun.fileinfomation;

import java.io.File;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//파일에 대한 정보 확인
		try {
			//File 인스턴스 생성
			//Windows 에서는 디렉토리 구분 기호가 \ 인데
			//프로그래밍 언어에서는 \가 오고 하나의 문자가 오면 제어문자로 인식합니다.
			//\를 입룍하고자 할 때는 \\ 이렇게 해야 합니다.
			 File f = new File("C:\\Users\\user>\\\\172.30.1.28\\702공유\\1026.txt");
			 
			 //파일의 존재 여부 확인
			 System.out.println(f.exists()); //있으면 true, 없으면 false
			 //마지막 수정 날짜
			 System.out.println(f.lastModified());
			 System.out.println(new Date(f.lastModified()));
			 
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		

	}

}
