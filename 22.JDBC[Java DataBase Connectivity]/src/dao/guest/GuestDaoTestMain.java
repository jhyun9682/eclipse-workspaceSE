package dao.guest;

public class GuestDaoTestMain {

	public static void main(String[] args)  throws Exception{
		GuestDao guestDao=new GuestDao();
		
		System.out.println("1.insertGuest");
		System.out.println("2.deleteGuest");
		System.out.println(guestDao.deleteGuest(8));
		
		System.out.println("3.updateGuest");
		System.out.println("4.selectByNo");
		System.out.println("5.selectAll");

	}

}
 