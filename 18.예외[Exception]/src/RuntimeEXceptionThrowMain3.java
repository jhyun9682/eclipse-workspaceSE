
public class RuntimeEXceptionThrowMain3 {

	public static void main(String[] args) /*throws RuntimeException*/{
		// ClassCastException
		System.out.println("stmt1");
		Object o1= new Object();
		System.out.println("stmt2");
		Object o2= new String("문자열");
		System.out.println("stmt3");
		String str1=(String)o1;
		String str2=(String)o2;
		System.out.println("stmt4");

	}

}
