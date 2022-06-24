package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressDao {
	
	public int insert(Address address) throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String insertSql="insert into address values(address_no_seq.nextval,'guard','김경호','123-4568','경기도 성남시')";

		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSql);
		return rowCount;
		
	}
	public int deleteByNoint (int no) throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String deleteSql="delete address where no=1";
		
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(deleteSql);
		return rowCount;
	}
	public int updateByNo(Address address) throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String updateSql="update address set id='xxx',name='김경호',phone='899-9999',address='서울시 강남구' where no = 1";
		
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSql);
		return rowCount;
	}
	public void selectByNo(int no) throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String selectSql="select no,id,name,phone,address from address where no = 3";
		
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(selectSql);
	}
	public void selectAll() throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String selectSql="select no,id,name,phone,address from address where no = 3";
				
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		
	}

}
