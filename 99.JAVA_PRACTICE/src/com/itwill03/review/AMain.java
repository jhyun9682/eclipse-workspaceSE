package com.itwill03.review;
/*
 * 2.AMain 이라는 이름의 클래스작성
	2-1.AMain 클래스에 메인메쏘드 작성(생성)
		2-1-1.메인메쏘드에 코드작성
                  - A객체생성
		  - A객체멤버변수에 값대입
                  - A객체멤버변수의 값출력
3.객체그래프를 그리고 주실행흐름을 표시하세요
*/

public class AMain {

	public static void main(String[] args) {
		A a1 = new A();
		a1.A(1, "홍길동");
		a1.print();
		System.out.println();
		
	}

}