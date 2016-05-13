package Ch2;

public class TestClock {

	public static void main(String[] args) {
		Clock c = new Clock();
		Clock def = new Clock();
		c.setDefaultCloseOperation(c.EXIT_ON_CLOSE);
		c.setVisible(true);
		//c.drawClock(15, 20, 500, 200);
	}

}