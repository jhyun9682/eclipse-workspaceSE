package dao.address.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Dao(Data[DataBase] Access Object) 객체(클래스)
 * - address 테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위 메소드를 가지고 있는 객체(클래스)
 */
public class AddressDao1 {
	public void insert() throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		String insertSQL="insert into address values(address_no_seq.nextval,'orange'||address_no_seq.nextval,'오렌지','890-9090','서울시민')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int insertRowCount= stmt.executeUpdate(insertSQL);
		System.out.println(">>"+insertRowCount+"행 insert");
		stmt.close();
		con.close();
	}
	public void updateByNo() throws Exception{
		String driverClass="oracle.jdbc.OracleDriverup";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		String updateSQL="update address set name='제임스',phone='333-3333',address='서울시 강남구' where no = 1";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int updateRowCount= stmt.executeUpdate(updateSQL);
		System.out.println(">>"+updateRowCount+"행 update");
		stmt.close();
		con.close();
	}
	public void deleteByNo() throws Exception{
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
	public void selectByNo() throws Exception{
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
	public void selectAll() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String selectSQL=" select no,id,name,phone,address from address";
		//
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		//
				
		if(rs.next()) {
		do {
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
		}while(rs.next());
		}else {
			System.out.println("조건 만족하는 주소록 없음");
		}
		
		rs.close();
		stmt.close();
		con.close();
	}


}