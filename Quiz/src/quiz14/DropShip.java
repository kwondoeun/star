package quiz14;

public class DropShip extends Unit {
	
	int hp = 60;
	
	public DropShip() {
		super(150);
	}

	@Override
	public void location() {
		System.out.println("νμ¬μμΉ:" + this.x + "," + this.y);
	}

	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void stop() {
		System.out.println("stop");
	}
	

}
