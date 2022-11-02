
import java.io.*;
import java.net.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class CoronaTeam {

	public static void main(String[] args) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("https://api.odcloud.kr/api/15085939/v1/uddi:0e83e53c-5990-4f35-b9e9-efc5173df70e?page=1&perPage=10&serviceKey=lMp9RoQ5DPXB2WMssZU%2F8BTrwH5j3vXOK8OmPx7AtkxsAFkqu1WaZuzN%2F6G4UkiXCMD%2BS4Uzdhz9RBvk8i0xrw%3D%3D"); /*URL*/

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

				System.out.println((String)jsonObj.get("월")); 
				System.out.println("가양동: " + jsonObj.get("가양동") + "명");
				System.out.println("개화동: " + jsonObj.get("개화동") + "명");
				System.out.println("공항동: " + jsonObj.get("공항동") + "명");
				System.out.println("내발산동: " + jsonObj.get("내발산동") + "명");
				System.out.println("등촌동: " + jsonObj.get("등촌동") + "명");
				System.out.println("마곡동: " + jsonObj.get("마곡동") + "명");
				System.out.println("방화동: " + jsonObj.get("방화동") + "명");
				System.out.println("염창동: " + jsonObj.get("염창동") + "명");
				System.out.println("오쇠동: " + jsonObj.get("오쇠동") + "명");
				System.out.println("외발산동: " + jsonObj.get("외발산동") + "명");
				System.out.println("화곡동: " + jsonObj.get("화곡동") + "명");


			}
			// StudyingAzae, Soodal 출력
		}
	}

	static String value;

}