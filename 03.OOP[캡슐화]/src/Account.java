/*
 *계좌객체를 생성하기위한클래스(틀,타입)
 */
/**
 * 계좌객체를 생성하기위한클래스(틀,타입)
 * 
 * @author KIM
 */
public class Account {
	/*
	 * 1.속성[멤버필드]
	 */
	private int no;			//계좌번호
	private String owner;	//계좌주이름
	private int balance;	//잔고
	private double iyul;    //이율
	/*
	 * 2. 멤버메쏘드[기능](계좌 객체가 가지고있는 기능 )
	 */
	
	/*
	 * 계좌데이타를 대입하는메쏘드
	 */
	/**
	 * 계좌객체초기화메쏘드
	 * @param no 계좌번호
	 * @param owner 계좌주
	 * @param balance 잔고
	 * @param iyul 이율
	 */
	public void setAccountData(int no,String owner,int balance,double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	}
	
	/*
	 * 입금
	 */
	/**
	 * 입금
	 * @param m 입금할돈
	 */
	public void deposit(int m) {
		this.balance+=m;
	}
	/*
	 * 출금
	 */
	public void withDraw(int m) {
		this.balance-=m;
	}
	/*
	 * 계좌헤더출력메쏘드(?????)
	 */
	public void headerPrint() {
		System.out.println("--------------------------");
		System.out.printf("%s %5s %4s %4s \n","번호","이름","잔고","이율");
		System.out.println("--------------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	/**
	 * 계좌객체정보출력
	 */
	public void print() {
		System.out.printf("%d %6s %8d %5.2f \n",this.no,this.owner,this.balance,this.iyul);
	}
	//getter,setter

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * 
	 * @return 잔고
	 */
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getIyul() {
		return iyul;
	}

	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
}














