package dao.address.forth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*
 * Dao(Data[DataBase] Access Object) 객체(클래스)
 * - address 테이블에 CRUD(Create,Read,Update,Delete)작업을 하는 단위 메소드를 가지고 있는 객체(클래스)
 */
public class AddressDao4 {
public int insert(Address address) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		String insertSQL="insert into address values(address_no_seq.nextval,'"+address.getId()+"','"+address.getName()+"','"+address.getPhone()+"','"+address.getAddress()+"')";
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int insertRowCount= stmt.executeUpdate(insertSQL);
		//System.out.println(">>"+insertRowCount+"행 insert");
		stmt.close();
		con.close();
		return insertRowCount;
	}
	
	public int updateByNo(Address updateAddress) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		String updateSQL="update address set name='"+updateAddress.getName()+"',phone='"+updateAddress.getPhone()+"',address='"+updateAddress.getAddress()+"'where no ="+updateAddress.getNo();
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int updateRowCount= stmt.executeUpdate(updateSQL);
		stmt.close();
		con.close();
		return updateRowCount;
	}
	
	public int deleteByNo(int no) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		
		String deleteSQL="delete address where no="+no;
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		
		int deleteRowCount= stmt.executeUpdate(deleteSQL);
		stmt.close();
		con.close();
		return deleteRowCount;
	}
	public Address selectByNo(int n) throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		//
		Address findAddress=null;
		String selectSQL=" select no,id,name,phone,address from address where no = "+n;
		//
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(selectSQL);
		//
		
		if(rs.next()) {
			
			int no=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("Phone");
			String address=rs.getString("address");
			findAddress=new Address(no,id,name,phone,address);
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
		}else{
			System.out.println("조건 만족하는 주소록 없음");
			
		}
		rs.close();
		stmt.close();
		con.close();
		return findAddress;
	}
	public List<Address> selectAll() throws Exception{
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		ArrayList <Address> addressList=new ArrayList <Address>();
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
			
			int no=rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("Phone");
			String address=rs.getString("address");
			System.out.println(no+"\t"+name+"\t"+phone+"\t"+address);
			addressList.add(new Address(no, id, name, phone, address));
		}while(rs.next());
		}else {
			System.out.println("조건 만족하는 주소록 없음");
		}
		
		rs.close();
		stmt.close();
		con.close();
		return addressList;
	}


}
