package dao.address.forth;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

public class AddressDao4TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao4 addressDao= new AddressDao4();
		/* AddressDao4에서 AddressDao4TestMain으로 데이터 리턴*/
		System.out.println("1.insert");
		
		try{
			Address insertAddress
			= new Address(0,"cherry","체리","222-5656","미국");
			int insertRowCount=addressDao.insert(insertAddress);
			
		System.out.println(">>InsertRowCount:"+insertRowCount);

		}catch(SQLIntegrityConstraintViolationException e) {
			System.out.println(">>이미존재하는 아이디입니다.");
		}
	
		

		System.out.println("2.selectByno");
		Address findAddress=addressDao.selectByNo(34);
		System.out.println(findAddress);
		
		System.out.println(addressDao.selectByNo(35));
	   
		findAddress=addressDao.selectByNo(36);
		System.out.println(findAddress);
		
		System.out.println(addressDao.selectByNo(2));
		
		System.out.println("3.selectAll");
		List<Address> addressList =
				addressDao.selectAll();
		System.out.println(addressList);
		
		System.out.println("4.update");
		Address updateAddress=new Address(100, null,"김변경", "888-8888", "경남 산청");
		int updateRowCount=addressDao.updateByNo(updateAddress);
		System.out.println("updateRowCount:"+updateRowCount);
		
		System.out.println("5.delete");
		int deleteRowCount =addressDao.deleteByNo(30);
		addressDao.deleteByNo(31);
		addressDao.deleteByNo(32);
		System.out.println("deleteRowCount:"+deleteRowCount);
		
	

	}

}
