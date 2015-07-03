package thread;

public class AtmMain {
	public static void main(String[] args) {
		Atm atm = new Atm();
		Runnable hong = new AtmUser(atm,"È«±æµ¿");
		Runnable kim = new AtmUser(atm,"±èÀ¯½Å");
		Runnable lee = new AtmUser(atm,"ÀÌ¼ø½Å");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(lee);
		thr3.start();

	}
}