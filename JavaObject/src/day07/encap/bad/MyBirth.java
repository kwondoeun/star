package day07.encap.bad;

public class MyBirth {
	
	//좋지 못한 예제 (변수를 public으로 열어놓음)
	public int year;
	public int month;
	public int day;
	public String ssn; //주민번호
	
	public void intfo() {
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println("주민번호:" + ssn);
	}

}
