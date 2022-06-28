package com.itwill.guest;

import java.util.List;

/*
 * -방명록(guest) 관리 비지니스로직(업무)를 수행하는 클래스
 * -GUI객체(스윙,서블릿,JSP)에서 직접접근(메소드호출)하는 클래스
 * -GuestDao객체를 이용해서 데이터베이스에 접근하는 클래스
 */
public class GuestService {
	private GuestDao guestDao;
	public GuestService() {
		guestDao=new GuestDao();
	}
	public int insertGuest(Guest guest) throws Exception{
		return guestDao.insertGuest(guest);
		
	}
	public int updateGuest(Guest guest) throws Exception{
		return guestDao.updateGuest(guest);
		
	}
	public int deleteGuest(int guest_no) throws Exception {
		return guestDao.deleteGuest(guest_no);
		
	}
	public Guest selectByNo(int guest_no) throws Exception{
		return guestDao.selectByNo(guest_no);
		
	}
	public List<Guest> selectAll() throws Exception{
		return guestDao.selectAll();
	}

}
