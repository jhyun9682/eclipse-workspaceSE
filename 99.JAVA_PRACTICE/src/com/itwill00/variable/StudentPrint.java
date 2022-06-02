package com.itwill00.variable;


public class StudentPrint {

	public static void main(String[] args) {
		
		int number1,number2,total1, total2, rank, kor1, kor2, eng1, eng2, math1, math2;
		String name1, name2;
		double avg1, avg2;
		char grade;
		
		number1=1;
		name1="KIM";
		kor1=34;
		eng1=45;
		math1=67;
		total1=kor1+eng1+math1;
		avg1=total1/3;
		
		
		number2=2;
		name2="HIM";
		kor2=34;
		eng2=45;
		math2=67;
		total2=kor2+eng2+math2;
		avg2=total2/3;				
		
		
		grade='C';
		rank=0;
		
		
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름  국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(number1+"    "+name1+"  "+kor1+"  "+eng1+"  "+math1+"  "+total1+"  "+Math.round(avg1)+"  "+grade+"  "+rank);
		System.out.println(number2+"    "+name2+"  "+kor2+"  "+eng2+"  "+math2+"  "+total2+"  "+Math.round(avg2)+"  "+grade+"  "+rank);
		System.out.println("-----------------------------------------------");

	}

}
