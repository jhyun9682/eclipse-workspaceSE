
public class ControlStopThreadMain {

	public static void main(String[] args) throws Exception {
		System.out.println("1.main");
		ControlStopThread1 cst1=new ControlStopThread1();
		cst1.start();
		ControlStopThread2 cst2= new ControlStopThread2();
		cst2.start();
		
		Thread.sleep(10000);
		
		//cst2.stop();
		cst2.setPlay(false);
		

		System.out.println("9.main thread jvm return");
	}

}
