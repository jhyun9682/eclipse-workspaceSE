package com.itwill03.review;


public class MemberMethodReturnMain {

	public static void main(String[] args) {
		/*
		 * MemberMethodReturn 객체생성
		 */
		MemberMethodReturn mmr=
				new MemberMethodReturn();
		mmr.setMemberField1(1);
		mmr.setMemberField2(2);
		mmr.setMemberField3(3);
		int returnMemberField1=mmr.getMemberField1();
		int returnMemberField2=mmr.getMemberField2();
		int returnMemberField3=mmr.getMemberField3();
		/*
		 MemberMethodReturn객체의  method1 호출후 반환데이타받아서 출력
		 */
		int returnData1=mmr.method1();
		System.out.println(returnData1);
		
		/*
		 MemberMethodReturn객체의  method2 호출후 반환데이타받아서 출력
		 */
		boolean returnData2=mmr.method2();
		System.out.println(returnData2);
	
		
		/*
		 MemberMethodReturn객체의 add메쏘드를 정수인자 두개를 넣어서 호출후 
		 반환되는 정수데이타받아서 출력
		 
		 */
		int addResult1=mmr.add(1234, 5678);
		System.out.println(addResult1);
		
		/*
		 MemberMethodReturn객체의 hello 메쏘드를 문자열인자 한개 넣어서 호출후 
		 반환되는 문자열데이타받아서 출력
		 */
		String returnMessage1=mmr.hello("홍길동");
		System.out.println(returnMessage1);
	}

}














