package wrapper;
/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		System.out.println("------------Boxing UnBoxing---------");
		//Boxing[기본형->Wrapper객체]
		Character wc=new Character('김');
		Integer wi=new Integer(12315);
		Double wd=new Double(3.14159);
		Boolean wb=new Boolean(true);
		//UnBoxing[Wrapper객체->기본형]
		char c1=wc.charValue();
		int i1=wi.intValue();
		double d1=wd.doubleValue();
		boolean b1=wb.booleanValue();
		System.out.println("------------Auto Boxing Auto UnBoxing---------");
		//Auto Boxing[기본형->Wrapper객체]
		Character wc2='김';
		Integer wi2=12135;
		Double wd2=3.14159;
		Boolean wb2=true;
		
		char c2=wc2;
		int i2=wi2;
		double de=wd2;
		boolean b2=wb2;
		

	}

}
