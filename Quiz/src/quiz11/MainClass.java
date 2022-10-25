package quiz11;

public class MainClass {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		com.ComputerInfo();
		
		//6
		Monitor m = com.getMonitor();
		m.info();
		
	}
	
}
