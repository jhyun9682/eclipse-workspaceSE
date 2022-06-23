package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressTableSelectByPrimaryKeyMain {

	public static void main(String[] args) throws Exception {
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String selectSQL=" select no,id,name,phone,address from address where no = 1";
		//
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		//
		boolean isExist = rs.next();
		if(rs.next()) {
			/*
			 * DB타입 		 | 자바타입
			 * number 		 | int,double
			 * varchar2,char | String
			 * Date 		 | Date
			 * 
			 *  XXX data=rs.getXXX("컬럼이름");
			 */
			int no=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("Phone");
			String address=rs.getString("address");
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
		}else{
			System.out.println("조건 만족하는 주소록 없음");
			
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
