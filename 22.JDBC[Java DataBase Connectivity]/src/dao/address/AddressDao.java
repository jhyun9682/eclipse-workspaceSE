package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddressDao {
	//
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
	String user="jdeveloper00";
	String password="jdeveloper00";
	//
	
	public int insert(Address address) throws Exception{
		String insertSql=
		"insert into address values(address_no_seq.nextval,'"+address.getId()+"','"+address.getName()+"','"+address.getPhone()+"','"+address.getAddress()+"')";
		
		Class.forName(driverClass);
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(insertSql);
		return rowCount;
		
	}
	public int deleteByNo (int no) throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String deleteSql="delete address where no=1";
		
		Class.forName(driverClass);
		
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
		String updateSql="update address set id='xxx',name='"+address.getName()+"',phone='"+address.getPhone()+"',address='"+address.getAddress()+"' where no = '"+address.getNo()+"'";
		
		Class.forName(driverClass);
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		int rowCount=stmt.executeUpdate(updateSql);
		return rowCount;
	}
	public Address selectByNo(int no) throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String selectSql="select no,id,name,phone,address from address where no ="+no ;
		Address findAddress=null;
		Class.forName(driverClass);
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSql);
		if(rs.next()){
		
			 findAddress=
					new Address(rs.getInt("no"),
								rs.getString("id"),
								rs.getString("name"),
								rs.getString("phone"),
								rs.getString("address"));
		}
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
		}
		
	public List<Address> selectAll() throws Exception{
		//
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		String selectSql="select no,id,name,phone,address from address";
		List<Address> addressList=new ArrayList<Address>();
		Class.forName(driverClass);
		
		Connection con= DriverManager.getConnection(url, user, password);
		Statement stmt=con.createStatement();
		ResultSet rs= stmt.executeQuery(selectSql);
		while(rs.next()) {
			addressList.add(new Address(rs.getInt("no"),
										rs.getString("id"),
										rs.getString("name"),
										rs.getString("phone"),
										rs.getString("address")));
		}
		return addressList;
		
	}

}
