
public class OuterClass2 {
	/*****member field*****/
	public int outer_member_field;
	/*****member method*****/
	public void outer_member_method() {
		System.out.println("OuterClass2.outer_memeber_method()");
	}
	public void outer_member_method2() {
		/*
		 local 변수
		 */
		int iocal_variable=100;
		/*<<특정 클래스의 메소드를 재정의 해야할때 >>
		 * 1.local 위치에서 클래스를 정의
		 * 2.local 위치에서 객체를 생성
		 */
		/*****annonymous local inner class*****/
		FirstEmptyClass firstEmptyClassChild=new FirstEmptyClass() {
			@Override
			public void local_inner_outer_access() {
				System.out.println("FirstEmptyClass를 상속받은 이름없는 클래스에서 재정의한 local_inner_outer_access()");
				
			}
		};
		System.out.println(firstEmptyClassChild);
		firstEmptyClassChild.local_inner_outer_access();
		SecondAbstractClass secondabstractClassChild=new SecondAbstractClass() {
			@Override
			public void local_inner_outer_access() {
				System.out.println("SecondAbstractClass를 상속받은 이름없는 클래스에서 재정의한 local_inner_outer_access()");
				
				
			}
		};
		System.out.println(secondabstractClassChild);
		secondabstractClassChild.local_inner_outer_access();
		
		ThirdInterface thirdInterfaceImpl=new ThirdInterface() {
			@Override
			public void local_inner_outer_access() {
				System.out.println("ThirdInterface를 상속받은(구현한) 이름없는 클래스에서 재정의한 local_inner_outer_access()");
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println(thirdInterfaceImpl);
		thirdInterfaceImpl.local_inner_outer_access();
		Object objectChild= new Object(){
			@Override
			public String toString() {
				
				return "이름없는 Object자식객체에서 재정의한 toString()";
			}
		};
		System.out.println(objectChild);
		System.out.println(objectChild.toString());
	}
	/*****member inner class*****/
	

}
