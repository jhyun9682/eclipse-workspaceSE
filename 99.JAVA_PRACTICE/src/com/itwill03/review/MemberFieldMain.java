package com.itwill03.review;

public class MemberFieldMain {

	public static void main(String[] args) {
		/*
		 * 1.MemberField객체생성
		 */
		MemberField mf1;
		mf1 = new MemberField();
		
		/*
		 * 2.MemberField객체의 멤버변수4개에 데이타대입
		 */
		mf1.member1 = 15;
		mf1.member2 = 0.5;
		mf1.member3 = '가';
		mf1.member4 = "홍길동";
		
		/*
		 * 3.MemberField객체의 4개멤버변수내용출력
		 */
		System.out.println(mf1.member1);
		System.out.println(mf1.member2);
		System.out.println(mf1.member3);
		System.out.println(mf1.member4);
	}

}
