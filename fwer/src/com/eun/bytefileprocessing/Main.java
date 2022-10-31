package com.eun.bytefileprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //소문자 m은 분

			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("./" + sdf.format(date) + ".txt", true);

			//기록할 메시지 생성
			String msg = "안녕";

			//파일에 기록
			fos.write(msg.getBytes());

			//파일을 닫기
			fos.close();

		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

		//앞에서 작성한 파일 읽기
		try {
			//읽기 위한 파일 생성
			FileInputStream fis = new FileInputStream("2022-10-27.txt");
			//읽어서 저장할 바이트 배열을 생성
			byte[] b = new byte[fis.available()];
			//읽기
			fis.read(b);
			//읽은 내용확인 - 문자열로 변환
			System.out.println(new String(b));
			//읽은 내용확인 - 배열로 변환
			System.out.println(Arrays.toString(b));

			fis.close();

		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
	
}
