import java.io.*;
import java.net.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Corona {

	public static void main(String[] args) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("https://api.odcloud.kr/api/15065107/v1/uddi:2b284bfd-736b-4994-87c0-e0823c9afb8b?page=1&perPage=17&serviceKey=YBbznktlgIHmS75IUOGP8LSqK98%2BfsfU%2FBJKY48DoE3ZQkPJ453%2F%2BC8avFQUOeycH0EDuDRK%2FEdwZuN4GunWZA%3D%3D"); /*URL*/

		URL url = new URL(urlBuilder.toString());
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-type", "application/json");
		System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;
		if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();


		value  = sb.toString();


		System.out.println(value);

		JSONParser parser = new JSONParser();
		Object obj = parser.parse(value);
		JSONObject jsonMain = (JSONObject)obj;

		JSONArray jsonArr = (JSONArray)jsonMain.get("data");

		if (jsonArr.size() > 0){
			for(int i=0; i<jsonArr.size(); i++){
				JSONObject jsonObj = (JSONObject)jsonArr.get(i);

				System.out.println((String)jsonObj.get("행정동")); 
				System.out.println((String)jsonObj.get("확진자 수(명)")+ "명"); 

			}
		}
	}

	static String value;

}