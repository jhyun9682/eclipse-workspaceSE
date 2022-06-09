import java.awt.Toolkit;

public class ConCurrentBeep extends Thread {
	
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			try {
				toolkit.beep();
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
