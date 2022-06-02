package com.itwill04.array.academy;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AcademyMember m1=new AcademyStaff();
		AcademyMember m2=new AcademyStudent();
		AcademyMember m3=new AcademyGangsa();
		
		AcademyMember[] members={
				new AcademyStudent(1, "KIM", "자바"),
				new AcademyStudent(2, "LEE", "리눅스"),
				new AcademyStudent(3, "KIM", "자바"),
				new AcademyStudent(4, "LEE", "IOT"),
				new AcademyGangsa(5, "CHOI", "파이썬"),
				new AcademyGangsa(6, "KIM", "자바"),
				new AcademyGangsa(7, "DIM", "자바"),
				new AcademyStaff(8, "AIM", "영업"),
				new AcademyStaff(9, "QIM", "생산")
		};
		
		System.out.println("1.AcademyMember 전체출력");
		
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				members[i].print();
			}
		}
		
		System.out.println("2.번호 1   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				int tempNo = members[i].getNo();
				if (tempNo==1) {
					members[i].print();
					break;

				}
			}
		}
		
		System.out.println("2.번호 2   번 AcademyMember 한명 출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				int tempNo = members[i].getNo();
				if (tempNo==2) {
					members[i].print();
					break;

				}
			}
		}
		System.out.println("2.이름 KIM 인 AcademyMember 들   출력");
		for (int i = 0; i < members.length; i++) {
			if (members[i] != null) {
				String tempName = members[i].getName();
				if (tempName.equals("KIM")) {
					members[i].print();
					continue;

				}
			}
		}
		
		System.out.println("##############################################");
		
		System.out.println("3.AcademyMember 중에서 AcademyStudent들 출력");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStudent) {
				members[i].print();

				}
		}
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa들 출력");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyGangsa) {
				members[i].print();
				
			}
		}
		
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff들 출력");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStaff) {
				members[i].print();
				
			}
		}
		
		
		System.out.println("4.AcademyMember 중에서 자바 반 AcademyStudent 들 출력");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStudent) {
				AcademyStudent tempStudent =(AcademyStudent)members[i];
				if(tempStudent.getBan().equals("자바")) {
				members[i].print();						
				}
			}
			}
		
		
		System.out.println("4.AcademyMember 중에서 자바 과목인 AcademyGangsa  들 출력");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyGangsa) {
				AcademyGangsa tempGangsa =(AcademyGangsa)members[i];
				if(tempGangsa.getSubject().equals("자바")) {		
				members[i].print();
				}
			}
		}
		System.out.println("4.AcademyMember 중에서 영업 부서인 AcademyStaff   들 출력");
		for(int i=0;i<members.length;i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff tempStaff =(AcademyStaff)members[i];
				if(tempStaff.getDepart().equals("영업")) {
				members[i].print();
				}
			}
		}
		
	
		/************************** 과제가아닙니다**************************************
		AcademyStudent tempStudent =(AcademyStudent)members[i];
		String tempBan=tempStudent.getBan();
		System.out.println(tempBan);
		******************************************************************************/
	
}	

}


