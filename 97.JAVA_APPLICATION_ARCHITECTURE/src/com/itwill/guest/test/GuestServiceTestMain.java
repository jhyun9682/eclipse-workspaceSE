package com.itwill.guest.test;

import java.util.List;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args) throws Exception{
		GuestService guestService=new GuestService();
		System.out.println("1.방명록쓰기");
		Guest insertGuest= new Guest(0,"아무개",null,"unknown@google.com",
				"http://www.naver.com","타이틀","컨텐츠");
		System.out.println(">>insert count:"+guestService.insertGuest(insertGuest));
		System.out.println("2.방명록수정");
		Guest guest = guestService.selectByNo(19);
		guest.setGuest_title("안소진님 제목");
		guest.setGuest_content("화이팅");
		
		System.out.println(">>update count:"+guestService.updateGuest(guest));
		
		System.out.println("3.방명록삭제");
		System.out.println(">>delete count:"+guestService.deleteGuest(15));
		
		System.out.println("4.방명록1개보기");
		System.out.println(">>"+guestService.selectByNo(25));
		
		System.out.println("5.방명록 여러개");
		List<Guest> guestList=guestService.selectAll();
		for(Guest guest2:guestList) {
			System.out.println(guest2);
		}

	}

}
