package dao.address.first;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		AddressDao addressDao= new AddressDao();
		addressDao.insert();
		addressDao.update();
		addressDao.delete();
		addressDao.selectByno();
		addressDao.selectAll();
	

	}

}
