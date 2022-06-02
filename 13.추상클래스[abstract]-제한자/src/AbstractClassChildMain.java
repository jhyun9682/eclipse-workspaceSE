
public class AbstractClassChildMain {

	public static void main(String[] args) {
		//AbstractClass ac= new AbstractClass(); Cannot instantiate the type AbstractClass
		
		System.out.println("-------------------ac1--------------");
		AbstractClassChild acc1= new AbstractClassChild();
		acc1.method1();
		acc1.method2();

		System.out.println("-------------------ac2--------------");
		AbstractClass acc2=new AbstractClassChild();
		acc2.method1();
		acc2.method2();
	}

}
