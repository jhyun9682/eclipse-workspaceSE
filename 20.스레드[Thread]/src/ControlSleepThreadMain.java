
public class ControlSleepThreadMain {

	public static void main(String[] args) throws Exception{
		System.out.println("1.main");
		System.out.println("2.main 스레드 3초간 sleep");
		Thread.sleep(3000);
		System.out.println("3.main 스레드 3초후 깨어난후 실행");
		ControlSleepThread cst= new ControlSleepThread();
		cst.start();
		
		System.out.println("4.main 스레드 end return");
		

	}

}
