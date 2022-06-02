package com.itwill03.review;
/*
 * 2.BMain 이라는 이름의 클래스작성
	2-1.BMain 클래스에 메인메쏘드 작성(생성)
	       2-1-1.메인메쏘드에 코드작성
              	     - B객체생성
		     - B객체멤버변수2개(x,y)에 값대입
                     - B객체멤버변수2개의 값출력
		     - B객체멤버메쏘드2개호출(m1,m2)	
3.객체그래프를 그리고 주실행흐름을 표시하세요
 */
public class BMain {
	

		public static void main(String[] args) {
			B b1 = new B();
			b1.B("가", "나");

			b1.print();
			System.out.println();

			b1.method1();

			b1.method2();

		}

	}

