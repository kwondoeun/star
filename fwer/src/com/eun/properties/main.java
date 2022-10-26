package com.eun.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class main {

	public static void main(String[] args) {
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 키를 사용하면 null이 리턴
		System.out.println(properties.getProperty("name"));

		//프로퍼티스에 프로퍼티를 저장
		properties.setProperty("나루토", "최고의 닌자");
		properties.setProperty("크아", "물풍선 게임");
		properties.setProperty("삼겹살", "맛있는거");

		//텍스트 파일로 저장
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git 에 연결되신 분은 workspace가 아니고
			//c 드라이브의 사용자 디렉토리 안에 자신의 계정 안에 git 디렉토리에 있습니다.
			//properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
			properties.storeToXML(new FileOutputStream("./myproject.xml"), "xml로 저장");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
