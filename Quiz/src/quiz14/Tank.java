package quiz14;

public class Tank  extends Unit {

	private boolean mode;

	public Tank() {
		super(100);
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
	
	public void changeMode() {
		if(mode) {
			mode = false;
		} else {
			mode = true;
		}
	}

}
