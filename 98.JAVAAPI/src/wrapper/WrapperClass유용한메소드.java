package wrapper;

public class WrapperClass유용한메소드 {

	public static void main(String[] args) {
		System.out.println("int -> String");
		int y = 2147483647;
		String yStr1 = Integer.toString(y);
		System.out.println(yStr1);
		String yStr2 = y + "";
		System.out.println(yStr2);
		String yStr3 = Integer.toBinaryString(y);
		System.out.println(yStr3);// 이진문자열
		String yStr4 = Integer.toHexString(y);
		System.out.println(yStr4);
		System.out.println("String -> int,double,boolea...");
		int i1 = Integer.parseInt("546456718");
		System.out.println(i1);
		double d1 = Double.parseDouble("3.14159");
		System.out.println(d1);
		boolean b1 = Boolean.parseBoolean("true");
		System.out.println(b1);

		/* + 연산자
		 * -연산항이 문자인 경우 concat
		 * -연산항이 숫자인 경우 더함
		*/
		int number = 454354;
		String numberStr1 = number + "";
		System.out.println(numberStr1);
		String numberStr2 = 1 + 2 + 3 + 4 + (5 + "6");
		System.out.println(numberStr2);

		System.out.println("----------Charactor-------");
		Character wc1 = new Character('김');
		Character wc2 = '김';
		char c1 = wc1.charValue();
		char c2 = wc2;
		/*
		if(wc1==wc2) {
			System.out.println("wc1==wc2 주소같다.");
		}else {
			System.out.println("wc1!=wc2 주소 안같다.");
		}
		*/
		//Wrapper 객체의 값비교는 equals메소드를 사용해야 한다.
		if (wc1.equals(wc2)) {
			System.out.println("wc1의 char 값과 wc2의 char값이 동일하다.");
		}
		
		String strs="Hello Java!@##$@#$@#%_+_01234 김경호 제임스";
		
		
	}

}
