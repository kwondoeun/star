import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;

public class Sample2 {

	public static void main(String[] args) throws Exception {
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B553662/frtrlRdsfInfoService/getFrtrlRdsfInfoList"); /*URL*/
		
		urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=YBbznktlgIHmS75IUOGP8LSqK98%2BfsfU%2FBJKY48DoE3ZQkPJ453%2F%2BC8avFQUOeycH0EDuDRK%2FEdwZuN4GunWZA%3D%3D"); /*Service Key*/
		urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
		urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*한 페이지 결과 수*/
		urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8")); /*응답 결과의 출력 방식을 xml, json 형태로 변환 제공될 수 있도록 함*/
		urlBuilder.append("&" + URLEncoder.encode("srchFrtrlNm","UTF-8") + "=" + URLEncoder.encode("북한산", "UTF-8")); /*검색하고자 하는 숲길명 “TEXT”*/
		
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
		System.out.println(sb.toString());


        
        value = sb.toString();

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(value);
        
        JSONObject jsonMain = (JSONObject) obj;
        JSONArray jsonArr = (JSONArray)jsonMain.get("body");
        
        if (jsonArr.size() > 0){
            for(int i=0; i<jsonArr.size(); i++){
                JSONObject jsonObj = (JSONObject)jsonArr.get(i);
                
                System.out.println((String)jsonObj.get("name")); 
            }
            // StudyingAzae, Soodal 출력
        }
        
        

	}
	// jsonData
	static String value;
}
