public class AcademyGangsa extends AcademyMember {
	public String subject;//강의과목
	public AcademyGangsa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AcademyGangsa(int no,String name,String subject) {
		super(no,name);
		this.subject=subject;
		
		
	}
	@Override
	public void print() {
		super.print();
		System.out.println(this.subject);
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
