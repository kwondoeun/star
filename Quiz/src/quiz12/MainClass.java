package quiz12;

public class MainClass {
	public static void main(String[] args) {
		
		//카트객체
		MyCart cart = new MyCart(2000);
		
		cart.buy(new Tv()); //변수에 바로 집어넣는 방법
		cart.buy(new Tv()); 
		cart.buy(new Computer()); 
		cart.buy(new Radio());
		
		
	}

}
