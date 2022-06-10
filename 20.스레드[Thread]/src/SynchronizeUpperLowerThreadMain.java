
public class SynchronizeUpperLowerThreadMain {

	public static void main(String[] args) {
		Object monitor=new Object();
		
		SynchronizeUpperThread ut=new SynchronizeUpperThread(monitor);
		SynchronizeLowerThread lt=new SynchronizeLowerThread(monitor);
		//우선순위설정
		 
		ut.setPriority(10);
		lt.setPriority(1);
		ut.start();
		lt.start();
	}

}
