public class AcademyStudent extends AcademyMember {
	/*
	 *  public int no;
	public String name;
	  
	public void print() {
		System.out.print(this.no+"\t"+this.name+"\t");
	}
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	 */
	public String ban;// 반

	public AcademyStudent() {

	}

	public AcademyStudent(int no, String name, String ban) {
		super(no,name);
		//this.no = no;
		//this.name = name;
		this.ban = ban;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}
//재정의
	@Override 
	public void print() {
		//System.out.println(this.no+"\t"+this.name+"\t"+this.ban);
		super.print();
		System.out.println(this.ban);

	}
}
