package nogeneric;

public class MyArrayListMain {

	public static void main(String[] args) {
		MyArrayList myAccountList=new MyArrayList();
		System.out.println("#size:"+myAccountList.size());
		myAccountList.add(new Account());
		myAccountList.add(new Account());
		myAccountList.add(new Account());
		myAccountList.add(new Account());
		myAccountList.add(new Car());
		myAccountList.add(new Car());
		myAccountList.add(new Account());
		myAccountList.add(new Account());
		
		System.out.println("#size:"+myAccountList.size());
		Account getAccount=(Account)myAccountList.get(1);
		getAccount.print();

	}

}
