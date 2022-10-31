package com.eun.charaterstream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WepTextDownload {

	public static void main(String[] args) {
		try {
			//읽어올 URL을 생성
			URL url = new URL("https://www.choongang.co.kr");
			//URL에 연결
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			//문자열을 읽기 위한 스트림 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			br.close();
			con.disconnect();
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
