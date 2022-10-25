package quiz17;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			Validation.masking("950101-1000000");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
