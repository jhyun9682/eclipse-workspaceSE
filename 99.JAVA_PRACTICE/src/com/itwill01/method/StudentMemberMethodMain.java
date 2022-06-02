package com.itwill01.method;


public class StudentMemberMethodMain {

	public static void main(String[] args) {
		/*
		학생객체생성(3명)
		*/
		Student st1 = new Student();

		Student st2 = new Student();

		Student st3 = new Student();

		/*
		 학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출(3명)
		 */
		st1.setmethod(1, "김경호", 73, 45, 81);
		st2.setmethod(2, "김경수", 83, 72, 59);
		st3.setmethod(3, "김경희", 93, 79, 73);

		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */

		/*st1.totmethod();
		st2.totmethod();
		st3.totmethod();
		
		st1.avgmethod();
		st2.avgmethod();
		st3.avgmethod();
		
		st1.grademethod();
		st2.grademethod();
		st3.grademethod();*/
		
		st1.calculate();
		st2.calculate();
		st3.calculate();

		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint1();

		st1.print();
		st2.print();
		st3.print();
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1    ***   42   56   78   334  34.8  A   3  
		 2    ***   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		st1.headerPrint2();

	}

}
