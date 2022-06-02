package com.itwill00.variable;



public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int number1, number2, total1, total2, rank, kor1, kor2, eng1, eng2, math1, math2;
		String name1, name2;
		double avg1, avg2;
		char grade1, grade2;
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		number1 = 1;
		name1 = "김경호";
		kor1 = 62;
		eng1 = 65;
		math1 = 87;

		number2 = 2;
		name2 = "김경수";
		kor2 = 54;
		eng2 = 53;
		math2 = 76;

		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력한다.
		 *  
		 */
		if (kor1<0 || kor1>100) {
			System.out.println(kor1+">>국어 점수가 유효하지 않음");			
		}
		
		if (eng1<0 || eng1>100) {
			System.out.println(eng1+">>영어 점수가 유효하지 않음");			
		}
		
		if (math1<0 || math1>100) {
			System.out.println(math1+">>수학 점수가 유효하지 않음");			
		}
		
		if (kor2<0 || kor2>100) {
			System.out.println(kor2+">>국어 점수가 유효하지 않음");			
		}
		
		if (eng2<0 || eng2>100) {
			System.out.println(eng2+">>영어 점수가 유효하지 않음");			
		}
		
		if (math2<0 || math2>100) {
			System.out.println(math2+">>수학 점수가 유효하지 않음");			
		}
		


		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		total1 = kor1 + eng1 + math1;
		avg1 = total1 / 3;

		total2 = kor2 + eng2 + math2;
		avg2 = total2 / 3;

		rank = 0;

		if (avg1 >= 90) {
			grade1 = 'A';
		} else if (avg1 >= 80) {
			grade1 = 'B';
		} else if (avg1 >= 70) {
			grade1 = 'C';
		} else if (avg1 >= 60) {
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}

		
		if (avg2 >= 90) {
			grade2 = 'A';
		} else if (avg2 >= 80) {
			grade2 = 'B';
		} else if (avg2 >= 70) {
			grade2 = 'C';
		} else if (avg2 >= 60) {
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}

		/*
		- 출력포맷
		- 평균은 소수점이하 첫째자리까지출력(반올림)
		- 석차는 구하지마세요
		
		 */
		
		System.out.printf("--------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s\n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d\n",number1,name1,kor1,eng1,math1,total1,avg1,grade1,rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d\n",number2,name2,kor2,eng2,math2,total2,avg2,grade2,rank);
		System.out.printf("-----------------------------------------------\n");
		
	}

}
