package com.itwill00.variable;


public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		String str1,str2,str3,str4,str5,str6,str7,str8,str9;
		String name="홍길동";
		String look="중(상)";
		String member="236514";
		String number1="201212";
		String number2="3495039";
		String count="0";
		String smoking="true";
		String height="178.3";
		String gender="남";
		String grade="A";
		
		str1="회원번호 : ";
				
		str2="이   름 : ";
		
		str3="주민번호 : ";
			
		str4="성   별 : ";
		
		str5="결혼횟수 : ";
		
		str6="흡연여부 : ";
		
		str7="키     : ";
		
		str8="학  점 : ";
		
		str9="용  모 : ";
		
		
		System.out.println("*************************");
		System.out.println(str1+member);		
		System.out.println(str2+name);		
		System.out.println(str3+number1+"-"+number2);		
		System.out.println(str4+gender);		
		System.out.println(str5+count);		
		System.out.println(str6+smoking);		
		System.out.println(str7+height);		
		System.out.println(str8+grade);		
		System.out.println(str9+look);		
		System.out.println("*************************");
		
		
	}

}