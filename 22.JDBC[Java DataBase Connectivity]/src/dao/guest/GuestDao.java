package dao.guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
	
	public int insertGuest(Guest guest) {
		String insertSql="insert into guest values(guest_guest_no_seq.nextval,?,?,?,?,?,?)";
		return 0;
	}
	public int updateGuest(Guest guest) {
		String updateSql="update guest set guest_name=?,guest_date=?,guest_email=?,guest_homepage=?,guest_title=?,guest_content=? where guest_no=?";
		return 0;
		
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
	public Guest selectByNo(int guest_no) {
		String selectOneSql="select* from guest where guest_no=?";
		return null;
	}
	public List<Guest> selectByAll() {
		String selectAllSql="select * from guest";
		return null;
		
	}
	
	
}
