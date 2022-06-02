package com.itwill02.constructor;


public class StudentConstructorMain {

	public static void main(String[] args) {
		
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1=new Student();
		st1.setStudentData(1, "김경호", 75, 63, 81);
		
		Student st2=new Student(2,"김경수",86,51,63);
		Student st3=new Student(3,"김경희",97,75,81);
		
	
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.calculateTotal();
		st1.calculateAvg();
		st1.calculateGrade();
		
		st2.calculateTotal();
		st2.calculateAvg();
		st2.calculateGrade();

		st3.calculateTotal();
		st3.calculateAvg();
		st3.calculateGrade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.headerPrint();
		st1.print();
		st2.print();
		st3.print();
		
		System.out.println("********************************************");
		 //학생 student1 의 이름변경후 (이름변경메소드호출후) student1학생객체출력, setter
		st1.setName("홍길동");
		st1.print();

		
		 //학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		int returnTot = st1.getTot();
		System.out.println("학생 student1의 총점 데이터 반환:"+returnTot);
			

		 //학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		char returnGrade =st1.getGrade();
		System.out.println("학생 student1의 학점 데이터 반환:"+returnGrade);
		

		
	
	}

	

}