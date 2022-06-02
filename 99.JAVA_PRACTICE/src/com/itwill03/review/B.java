package com.itwill03.review;
/*
 * 1.B 라는 이름의 클래스작성
    1-1. B 클래스안에 멤버변수 2개선언(정의): 이름 x,y 
    1-2. B 클래스안에 멤버메쏘드 m1,m2 2개선언(정의)
	    - 멤버메쏘드내용은  System.out.println("m1호출");System.out.println("m2호출");
 */

public class B {
	String x, y;
	int m1, m2;

	public void B(String x, String y) {

		this.x = x;
		this.y = y;

	}

	public void print() {
		System.out.printf("%s %s", this.x, this.y);
	}

	void method1() {
		System.out.println("m1호출");

	}

	void method2() {
		System.out.println("m2호출");

	}

}
