package day07.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		me.setYear(2022); //set
		int year = me.getYear(); //get
		System.out.println("년도:" + year);
		
		me.setMonth(12); //set
		int month = me.getMonth(); //get
		
		me.setDay(15);
		int day = me.getDay();
		
		System.out.println(year + "년" + month + "월" + day + "일");
	}

}
