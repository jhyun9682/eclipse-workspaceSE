import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ReservationInfoDao {
	//private Data Data;
	public ReservationInfoDao() throws Exception{
		//Data= new Data();
	}
/*
  * 예매번호 부여?
 */
	public int insertReservationNo(int reservation_no)throws Exception{
		String insertQuery="";
		Connection con=null;
		PreparedStatement pstmt=null;
		int insertRowCount=0;
		try {
			//con=data.getConnection();
			pstmt=con.prepareStatement(insertQuery);
			pstmt.setInt(1, reservation_no);
			insertRowCount = pstmt.executeUpdate();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return insertRowCount;
		
	}
		
	/*
	 * 예매내역 
	 */
	public int selectReservationNo(int reservation_no)throws Exception{
		int count=0;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String selectQuery="select * from reservation_info";
		try {
			//con=data.getConnection();
			pstmt=con.prepareStatement(selectQuery);
			pstmt.setInt(1,reservation_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				count=rs.getInt(1);
			}
			
		}finally {
			if(con!=null) {
				con.close();
			}
		}
		return count;
	}
}
