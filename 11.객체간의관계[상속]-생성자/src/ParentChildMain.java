class Parent extends Object {
	private int member1;
	private int member2;

	public Parent() {
	//클래스 생성자 첫번째라인에서는 부모클래스의 생성자가 반드시 호출되어야 함
	//부모클래스 생성자 호출을 생략할 경우, 부모클래스의 기본생성자가 자동호출됨
	super();
	System.out.println("1.Object()기본생성자");
	System.out.println("2.Parent()기본생성자");
	}

	public Parent(int member1, int member2) {

		this.member1 = member1;
		this.member2 = member2;
	}

	public void method1() {
		System.out.println("Parent.method1()");
	}

	public void method2() {
		System.out.println("Parent.method2()");
	}

	public void print() {
		System.out.print(this.member1 + "\t" + this.member2 + "\t");

	}

	public int getMember1() {
		return member1;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public int getMember2() {
		return member2;
	}

	public void setMember2(int member2) {
		this.member2 = member2;
	}

}

class Child extends Parent {
	public int member3;

	public Child() {
		//클래스 생성자 첫번째라인에서는 부모클래스의 생성자가 반드시 호출되어야 함
		//부모클래스 생성자 호출을 생략할 경우, 부모클래스의 기본생성자가 자동호출됨
		super();//생성자호출
		System.out.println("3.Child()기본생성자 호출");
	}

	public Child(int member1, int member2, int member3) {
		//클래스 생성자 첫번째라인에서는 부모클래스의 생성자가 반드시 호출되어야 함
		//부모클래스 생성자 호출을 생략할 경우, 부모클래스의 기본생성자가 자동호출됨
		//매개변수를 가진 부모생성자를 호출가능(명시적으로 호출코드 기술해야함)
		//case1
		super(member1,member2);//Parent클래스->Parent(int member1,int member2)		
		
		/*
		 * 캡슐화하면 상속되어도 접근불가
		this.member1 = member1;
		this.member2 = member2;
		 */
		/*상속되어진 public 메소드를 사용해 접근가능
		this.setMember1(member1);
		this.setMember2(member2);
		 */
		this.member3 = member3;
		System.out.println("3.Child(int member1, int member2, int member3)생성자호출");
	}

	public void method3() {
		System.out.println("Child.method3()");
	}

	@Override
	public void print() {
		super.print();
		System.out.println(this.member3);
	}

	public int getMember3() {
		return member3;
	}

	public void setMember3(int member3) {
		this.member3 = member3;
	}

}

public class ParentChildMain {

	public static void main(String[] args) {
		System.out.println("----------------Child()---------");
		Child c1 = new Child();
		c1.print();
		Child c2=new Child(1,2,3);
		c2.print();

	}

}
