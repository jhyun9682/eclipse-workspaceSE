import java.io.IOException;
import java.net.Socket;

public class IOExceptionCatchMain {

	public static void main(String[] args) throws IOException {
		// IOException
		System.out.println("stmt1");
		/*
		자바컴파일러는 일반Exception발생 예상코드에 
		Exception처리를 하지않으면 컴파일에러를 발생시킴
			- Unhandled exception type IOException  
		 */
		try {

			System.out.println("stmt2");
			Socket socket = new Socket("wwww.sadfsa.com", 80);
			/*
			 * 1.예외상황 발생하면 IOException객체 생성하고 생성된 객체를 try블록 안에서 던지면
			 * catch블록에서 IOException객체를 잡는다.
			 * 2.현재 실행흐름은 실행을 멈추고 catch블록을 실행한다.
			 */
			System.out.println(socket);
			System.out.println("stmt3");
		} catch (IOException e) {
			// IOException 발생시 실행코드
			System.out.println("---catch start---");
			System.out.println("IOException메세지->" + e.getMessage());
			System.out.println("---catch end---");

		}
		System.out.println("stmt4");
	}

}
