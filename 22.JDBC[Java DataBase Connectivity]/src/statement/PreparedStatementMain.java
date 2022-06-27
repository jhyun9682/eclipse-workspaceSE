package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class PreparedStatementMain {

	public static void main(String[] args) throws Exception{
		/*******************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper27";
		String password="jdeveloper27";
		/*******************************************/
		
		
		
	
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("-----select pk-----");
		
		String selectOneSql="select* from guest where guest_no=?";
		PreparedStatement pstmt=con.prepareStatement(selectOneSql);
		pstmt.setInt(1, 20);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			int guest_no= rs.getInt("guest_no");
			String guest_name=rs.getString("guest_name");
			Date guest_date=rs.getDate("guest_date");
			String guest_email=rs.getString("guest_email");
			String guest_homepage=rs.getString("guest_homepage");
			String guest_title=rs.getString("guest_title");
			String guest_content=rs.getString("guest_content");
			System.out.println(guest_no+"\t"+guest_name+"\t"+guest_date+"\t"+guest_email+"\t"+guest_homepage+"\t"+guest_title+"\t"+guest_content);
			
		}
		rs.close();
		pstmt.close();
		
		System.out.println("-----select all-----");
		String selectAllSql="select * from guest";
		pstmt=con.prepareStatement(selectOneSql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			int guest_no= rs.getInt("guest_no");
			String guest_name=rs.getString("guest_name");
			Date guest_date=rs.getDate("guest_date");
			String guest_email=rs.getString("guest_email");
			String guest_homepage=rs.getString("guest_homepage");
			String guest_title=rs.getString("guest_title");
			String guest_content=rs.getString("guest_content");
			System.out.println(guest_no+"\t"+guest_name+"\t"+guest_date+"\t"+guest_email+"\t"+guest_homepage+"\t"+guest_title+"\t"+guest_content);
			
		}
		rs.close();
		pstmt.close();
		
		System.out.println("-----delete-----");
		String deleteSql="delete from guest where guest_no=?";
		pstmt=con.prepareStatement(deleteSql);
		pstmt.setInt(1, 3);
		
		int rowCount=pstmt.executeUpdate();
		System.out.println(rowCount+"행 delete..");
		pstmt.close();
		
		String insertSql="insert into guest values(guest_guest_no_seq.nextval,?,?,?,?,?,?)";
		
		pstmt=con.prepareStatement(insertSql);
		pstmt.setString(1, "김소라");
		java.util.Date utilBirthday=new SimpleDateFormat("yyyy/MM/dd").parse("1998/05/05");
		Date sqlBirthday=new Date(utilBirthday.getTime());
		pstmt.setDate(2,sqlBirthday);
		pstmt.setString(3, "guard@gmail.com");
		pstmt.setString(4, "http://itwill.co.kr");
		pstmt.setString(5, "dao연습");
		pstmt.setString(6, "dao객체연습해주세요");
		rowCount=pstmt.executeUpdate();
		System.out.println(rowCount+"행 insert..");
		pstmt.close();
		
				
		
		String updateSql="update guest set guest_name=?,guest_date=?,guest_email=?,guest_homepage=?,guest_title=?,guest_content=? where guest_no=?";
		pstmt=con.prepareStatement(updateSql);
		pstmt.setString(1, "김수박");
		pstmt.setDate(2,new Date(System.currentTimeMillis()));
		pstmt.setString(3,"water@naver.com");
		pstmt.setString(4,"http://melon.com");
		pstmt.setString(5,"수박먹고싶어요");
		pstmt.setString(6,"많이드세요");
		pstmt.setInt(7,10);
		
		rowCount= pstmt.executeUpdate();
		System.out.println(rowCount+"행 update..");
		
		pstmt.close();
		con.close();
		
	
	
	}

}
