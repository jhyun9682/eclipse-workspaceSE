import java.io.IOException;
import java.net.Socket;

public class Second {

	public void method2() throws IOException, NullPointerException{
		System.out.println("\t\t Second.method2()실행");
		/*case1(RuntimeException)*/
		/*
		 * 1.JVM 예외상황을 감지하고 예외객체(NullPointerException)생성
		 * 2.JVM은 생성한예외객체를 반환방향으로 던진다.(throw)
		 * 3.실행중인쓰레드는 실행을멈추고 호출한곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진예외객체의 메세지를 출력한후 쓰레드종료(shut down)
		
		String str=null;
		int length=str.length();
		System.out.println("length:"+length);
		 */
		/*case2(RuntimeException)*/
		/*
		 * 1.내가예외객체생성
		 * 2.내가 예외객체를 던진다.
		 * 3.실행중인쓰레드는 실행을멈추고 호출한곳(반환방향)으로 이동한다. 
		 * 4.JVM은 던져진예외객체의 메세지를 출력한후 쓰레드종료(shut down)
		 */
		/*
		NullPointerException ex=new NullPointerException("내가만든예외객체");
		boolean b = true;
		if (b) {
			throw ex;
		}
		*/
		/*case3(비RuntimeException)*/
		/*
		IOException ex = new IOException("비RuntimeException");
		boolean b=true;
		if(b) {
			throw ex; 
		}
*/
		Socket soket=new Socket("www.naver.com",80);
		System.out.println(soket);
		System.out.println("\t\t Second.method2()반환");
		return;
	}

}
