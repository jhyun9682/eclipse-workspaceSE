package dao.address.first;

public class AddressDao1TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao1 addressDao= new AddressDao1();
		
		System.out.println("1.insert");
		addressDao.insert();

		System.out.println("2.selectByno");
		addressDao.selectByNo();
		
		System.out.println("3.selectAll");
		addressDao.selectAll();
		
		System.out.println("4.update");
		addressDao.updateByNo();
		
		System.out.println("5.delete");
		addressDao.deleteByNo();
	
		
	

	}

}
