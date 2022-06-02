package com.itwill03.review;
/*
 * 1.A 라는 이름의 클래스작성
	1-1. A 클래스안에 멤버변수 2개선언(정의) 
 */

public class A {
	private int no;
	private String name;
	
	public void A(int no, String name) {
		
		this.no = no;
		this.name = name;
	}
	public void print() {
		System.out.printf("%d %s",this.no,this.name);
	}



}