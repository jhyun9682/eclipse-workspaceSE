package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StatementMain {

	public static void main(String[] args)throws Exception {
		
		/*******************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper27";
		String password="jdeveloper27";
		/*******************************************/
		
		
		Class.forName(driverClass);
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
				
		System.out.println("-----stmt.executeQuery(select)-----");
		int guest_number=6;
		String selectOneSql=
				"select* from guest where guest_no=2"+guest_number;
		ResultSet rs=stmt.executeQuery(selectOneSql);
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
		String selectAllSql=
				"select * from guest";
		
		rs.close();
		rs=stmt.executeQuery(selectAllSql);
		
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
		
		System.out.println("-----stmt.executeQuery(dml)-----");
		guest_number=6;
		String deleteSql="delete from guest where guest_no="+guest_number;
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+"행 delete..");
		
		int guest_no=0;
		String guest_name="김변수2";
		Date guest_date=null;
		String guest_email="change2@naver.com";
		String guest_homepage="http://www.itwill2.co.kr";
		String guest_title="타이틀2";
		String guest_content="내용2";
		
		
		String insertSql=
				"insert into guest values(guest_guest_no_seq.nextval,'"+guest_name+"',sysdate,'"+guest_date+"','"+guest_email+"','"+guest_homepage+"','"+guest_title+"')";
		System.out.println(">>insertSql:"+insertSql);
		rowCount=stmt.executeUpdate(insertSql);
		System.out.println(rowCount+"행 insert..");
		
		
		
		 guest_no=15;
		 guest_name="체인지";
		 guest_date=new Date(System.currentTimeMillis());
		 guest_email="change3@naver.com";
		 guest_homepage="http://www.change.co.kr";
		 guest_title="타이틀change";
		 guest_content="내용change";
		
		
		String updateSql=
				"update guest set guest_name='"+guest_name+"',guest_date=sysdate,guest_email='"+guest_email+"',guest_homepage='"+guest_homepage+"',guest_title='"+guest_title+"',guest_content='"+guest_content+"' where guest_no="+guest_no;
				System.out.println("updateSql:"+updateSql);
				rowCount=stmt.executeUpdate(updateSql);
				System.out.println(rowCount+" 행 update..");
				
		stmt.close();
		con.close();
		
		
		
		

	}

}
