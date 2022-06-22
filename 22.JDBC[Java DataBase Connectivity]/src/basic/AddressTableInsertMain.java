package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class AddressTableInsertMain {

	public static void main(String[] args) throws Exception{
		/*
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="java";
		String password="java";
		*/
		
		String insertSQL="insert into address values(address_no_seq.nextval,'orange'||address_no_seq.nextval,'오렌지','890-9090','서울시민')";
				
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int insertRowCount= stmt.executeUpdate(insertSQL);
		System.out.println(">>"+insertRowCount+"행 insert");
		stmt.close();
		con.close();
		

	}

}
