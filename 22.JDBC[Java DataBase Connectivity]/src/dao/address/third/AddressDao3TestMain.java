package dao.address.third;

import java.sql.SQLIntegrityConstraintViolationException;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao3 addressDao= new AddressDao3();
		/* AddressDao2TestMain에서 AddressDao2로 파라메타를 전달*/
		System.out.println("1.insert");
		
		try{
			Address address
			= new Address(0,"tomato","토마토","222-5656","대구");
			addressDao.insert(address);
		}catch(SQLIntegrityConstraintViolationException e) {
			System.out.println(">>이미존재하는 아이디입니다.");
		}
	
		

		System.out.println("2.selectByno");
		addressDao.selectByNo(34);
		addressDao.selectByNo(35);
		addressDao.selectByNo(36);
		
		System.out.println("3.selectAll");
		addressDao.selectAll();
		
		
		System.out.println("4.update");
		Address updateAddress=new Address(100, null,"김변경", "888-8888", "경남 산청");
		addressDao.updateByNo(updateAddress);
		
		System.out.println("5.delete");
		addressDao.deleteByNo(30);
		addressDao.deleteByNo(31);
		addressDao.deleteByNo(32);
		
		
	

	}

}
