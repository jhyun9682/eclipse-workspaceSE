package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableDeleteByPrimaryKeyMain {

	public static void main(String[] args) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		String deleteSQL="delete address where no=19";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int deleteRowCount= stmt.executeUpdate(deleteSQL);
		System.out.println(">>"+deleteRowCount+"행 update");
		stmt.close();
		con.close();

	}

}
