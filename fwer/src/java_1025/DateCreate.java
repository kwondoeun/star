package java_1025;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {
	
	public static void main(String[] args) {
		//현재 시간을 갖는 java.util.Date 인스턴스 생성
		Date currentTime = new Date();
		//출력 - 년월일 시분초 출력
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 : 1986년 5월 5일 13:00:00 로 설정
		Date firstMeetingTime = new Date(86, 4, 5, 13, 0, 0);
		//출력 - 년월일 시분초 출력
		System.out.println(firstMeetingTime);
		
		//년도만 추출해서 출력
		System.out.println(firstMeetingTime.getYear() + 1900); //선이 그어지기 때문에 안쓰는게 좋음
		
		//원하는 포맷으로 출력
		//1986년 5월 5일 ?요일 이라고 출력
		SimpleDateFormat sdf =  new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf.format(firstMeetingTime));
		
		//연습해볼만한 과제 - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력
		Date firstMeetingTime1 = new Date(86, 4, 5, 13, 0, 0);
		
		if(firstMeetingTime.equals(firstMeetingTime1)) {
			System.out.println(firstMeetingTime.getHours()+ " " + firstMeetingTime.getMinutes());
		} else {
			System.out.println(firstMeetingTime.getYear() +" "+ firstMeetingTime.getMonth() +" "+ firstMeetingTime.getDate());
		}
		
	}

}
