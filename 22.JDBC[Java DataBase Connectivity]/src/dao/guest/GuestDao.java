package dao.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DataSource;

/*
 * Dao(Data[DataBase] Access Object) 객체(클래스)
 * - Guest 테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위 메소드를 가지고 있는 객체(클래스)
 */
public class GuestDao {
	/*
	 * Dao 객체는 멤버변수로 Connection을 생성하는 DataSource객체를 가짐
	 */
	private DataSource dataSource;
	public GuestDao(){
		dataSource=new DataSource();
		
	}
	
	public int insertGuest(Guest guest) throws Exception{
		String insertSql="insert into guest values(guest_guest_no_seq.nextval,?,sysdate,?,?,?,?)";
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt= con.prepareStatement(insertSql);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return 0;
	}
	public int updateGuest(Guest guest) throws Exception{
		String updateSql="update guest set guest_name=?,guest_email=?,guest_homepage=?,guest_title=?,guest_content=? where guest_no=?";
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(updateSql);
		pstmt.setString(1, guest.getGuest_name());
		pstmt.setString(2, guest.getGuest_email());
		pstmt.setString(3, guest.getGuest_homepage());
		pstmt.setString(4, guest.getGuest_title());
		pstmt.setString(5, guest.getGuest_content());
		pstmt.setInt(6,guest.getGuesnt_no());
		int rowCount= pstmt.executeUpdate();
		return rowCount;
		
	}
	public int deleteGuest(int guest_no) throws Exception {
		String deleteSql="delete from guest where guest_no=?";
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(deleteSql);
		pstmt.setInt(1, guest_no);
		int rowCount=pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return 0;
		
	}
	public Guest selectByNo(int guest_no) throws Exception{
		String selectOneSql="select* from guest where guest_no=?";
		
		Guest findGuest=null;
		
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(selectOneSql);
		pstmt.setInt(1, guest_no);
		
		ResultSet rs= pstmt.executeQuery();
		if(rs.next()) {
			findGuest=
					new Guest(rs.getInt("guest_no"), 
							rs.getString("guest_name"), 
							rs.getDate("guest_date"), 
							rs.getString("guest_email"), 
							rs.getString("guest_homepage"), 
							rs.getString("guest_title"), 
							rs.getString("guest_content"));
		}
		return findGuest;
	}
	public List<Guest> selectAll() throws Exception{
		String selectAllSql="select * from guest";
		List<Guest> guestList=new ArrayList<Guest>();
		Connection con= dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(selectAllSql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			guestList.add(new Guest(rs.getInt("guest_no"), 
					rs.getString("guest_name"), 
					rs.getDate("guest_date"), 
					rs.getString("guest_email"), 
					rs.getString("guest_homepage"), 
					rs.getString("guest_title"), 
					rs.getString("guest_content")
					)
					);
		}
		rs.close();
		pstmt.close();
		con.close();
		
		
		return guestList;
		
	}
	
	
}
