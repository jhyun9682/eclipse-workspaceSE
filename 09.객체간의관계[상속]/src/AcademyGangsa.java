public class AcademyGangsa extends AcademyMember {
	public String subject;//강의과목
	public AcademyGangsa() {
		// TODO Auto-generated constructor stub
	}
	public AcademyGangsa(int no,String name,String subject) {
		this.no=no;
		this.name=name;
		this.subject=subject;
		
		
	}
	public void gangsaPrint() {
		this.print();
		System.out.println(this.subject);
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
