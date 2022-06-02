package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		//String클래스-https://docs.oracle.com/javase/8/docs/api/index.html
		/*
		 * String 객체 생성
		 * 1.생성자호출(명시적 호출)
		 * 2.""로 생성(암시적 호출)
		 */
		String name1=new String("KIM");
		String name2=new String("KIM");
		String name3="KIM";
		String name4="KIM";
		if(name1!=name2) {
			System.out.println("name1 != name2는 주소가 다르다");
		}
		if(name3==name4) {
			System.out.println("name3 == name4는 주소가 같다");
		}
		if(name1!="KIM") {
			System.out.println("name1 != \"KIM\"의 주소는 다르다");
		}
		if(name3=="KIM") {
			System.out.println("name3 == \"KIM\"의 주소는 같다");
		}
		System.out.println("----String 객체비교는 String 객체의 멤버문자열(char[])내용이 같은지 비교-----");
		/*
		 * << String >>
		 *   public boolean equals(Object anObject)
		 *     - Object에있는 equals메쏘드를 String 객체의 문자열비교로 재정의된메쏘드
		 * Overrides: equals in class Object
		 */
		System.out.println("----String 객체비교는 equals 메소드를 사용해야함-----");
		if(name1.equals(name2)) {
			System.out.println("name1의 문자열과 name2의 문자열이 동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1의 문자열과 name3의 문자열이 동일하다");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1의 문자열과  \"KIM\"의 문자열이 동일하다.");
		}
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"의 문자열과  \"KIM\"의 문자열이 동일하다.");
		}
		
		System.out.println("-------------equalsIgnoreCase[대소문자구별없이비교]---------");
		String yn="Yes";
		if(yn.equals("Yes")) {
			System.out.println("yn는 Yes와 동일하다");
		}
		if(!yn.equals("yes")) {
			System.out.println("yn는 yes와 동일하지않다");
			
		}
		if(yn.equalsIgnoreCase("yes")) {
			System.out.println("대소문자 관계없이 yes와 동일한 문자열임");
		}
		if(yn.equalsIgnoreCase("YES")) {
			System.out.println("대소문자 관계없이 YES와 동일한 문자열임");
		}
		if(yn.equalsIgnoreCase("YeS")) {
			System.out.println("대소문자 관계없이 YeS와 동일한 문자열임");
		}
		System.out.println("--------compareTo----------");
		String irum1="aaa";
		String irum2="aab";
		
		/*
		 * public int compareTo(String anotherString)
		 * -앞쪽문자열 유니코드 - 뒤쪽문자열 유니코드 의 결과를 반환한다.
		 * - 
		 */
		int unicodeGap = irum1.compareTo(irum2);
		System.out.println(unicodeGap);
		
		unicodeGap = irum2.compareTo(irum1);
		System.out.println(unicodeGap);
		
		if(irum1.compareTo(irum2) > 0) {
			System.out.println("irum1,irum2 교환[오름차순]");
		}
		
	}

}
