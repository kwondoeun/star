package day07.encap.good;
public class MyBirth {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/* 외우기
	 * 은닉된 변수에 접근할 때 클래스 설계자가 만들어 놓은
	 * getter/setter메서드를 사용
	 * 
	 * get 시작(값을 얻는다), set 시작(값을 저장)
	 * 
	 * set메서드
	 * 1. 값을 저장하는 메서드
	 * 2. public으로 선언하고 set + 멤버변수명으로 저장
	 */
	
	public void setYear(int year) {
		//유효값 검증
		if(year > 2022 || year < 1900) {
			System.out.println("년도는 1900~2022년까지 입니다");
		}else {
			System.out.println("저장완료");
			this.year = year;
		}
	}
	
	/*
	 * getter메서드
	 * 1. 값을 조회하는 메서드(반환 반드시 있음)
	 * 2. public으로 선언하고 get + 멤버변수명으로 지정
	 */
	public int getYear() {
		return year;
	}
	
	/*
	 * month, day, ssn에 대한 getter, setter생성
	 * month - 1~12월 까지만 저장가능
	 * day - 1~31일 까지만 저장가능
	 * ssn - 하이픈을 제거하고 13자리 까지만 저장가능
	 */
	//Month
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("월은 1~12월까지입니다");
		}else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	//Day
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("일자는 1~31까지 입니다");
		}else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	//Ssn
	public void setSsn(String ssn) {
		String result = ssn.replace("-","");
		if(result.length() > 13) {
			System.out.println("주민번호는 13자리 입니다");
		}else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}

}
