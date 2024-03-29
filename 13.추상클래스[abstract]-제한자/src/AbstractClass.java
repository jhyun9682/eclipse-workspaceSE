/*
추상클래스
  1.정의: 하나이상의 추상메소드가 정의되어있는 클래스
  1.정의: 추상메쏘드가 존재하지 않으나 객체생성을 막기위해 만든 클래스
     ex> public abstract class Test{
         	//추상메쏘드();
         	public abstract int print(int i);
         	//구현된메쏘드();
         	public void test(){
         	}
         }
         	==>추상메쏘드: 메쏘드의 구현부분(바디{})이 없고 선언부(signature)만 존재하는 메쏘드
            ex> public abstract int print(int i);             
  2. 추상클래스는 불완전한 추상메쏘드를 가지므로 객체생성이 불가능하다.
      Test t=new Test();(X)
  3. 추상클래스는 추상클래스를 상속받아서 추상메쏘드를 구현(오버라이딩)하는 자식 클래스를 만들어 
     사용(자식객체생성)해야한다 
*/ 
public abstract class AbstractClass {
	public void method1() {
		System.out.println("난 구상(Concrete) 메소드");
		
	}
	public abstract void method2();

}
