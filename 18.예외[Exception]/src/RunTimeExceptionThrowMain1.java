
public class RunTimeExceptionThrowMain1 {
/*
 * 모든 메소드는 throws RuntimeException 구문 생략되어있음
 * -이 메소드에선 RuntimeException의 자식Exception들이 발생할 수 있음
 */
	public static void main(String[] args) /*throws RuntimeException*/{
		// NullPointerException
		
		System.out.println("stmt1");
		String str=null;
		System.out.println("stmt2");
		//예외발생 예상코드
		int length=str.length();
		/*
		 1. 예외상황발생하면  NullPointerException객체생성한후 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
		 2. 현재실행흐름은 실행을멈추고 
		    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
		 */
		System.out.println(length);
		System.out.println("stmt3");
	}

}
