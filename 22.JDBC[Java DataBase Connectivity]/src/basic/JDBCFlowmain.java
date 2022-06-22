package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCFlowmain {

	public static void main(String[] args) throws Exception{
		
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		
		/*
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		*/
		String selectSql="select * from dept";
		
		/*1.Driver(Oracle) Class loading 
		 * -A.Driever 클래스객체 생성
		 * -B.DriverManager객체에 등록
		 * */
		Class.forName(driverClass);
		System.out.println("1.Driver class loading");
		
		/*2.Connection 객체 생성
		 * -DB Server 연결객체
		 */
		Connection con= DriverManager.getConnection(url,user,password);
		System.out.println("2.Connection객체생성(DBServer연결):"+con);
		
		/*3.Statement 객체 생성
		 * -SQL문 전송객체 생성
		 * */
		Statement stmt=con.createStatement();
		System.out.println("3.Statement객체생성(SQL문 전송객체):"+stmt);
		
		/*4.SQL전송 (select) */
		ResultSet rs=stmt.executeQuery(selectSql);
		
		/*5.Resultset 결과얻기
		 * -결과얻기
		 * 
		 * */
		System.out.println("4,5.ResultSet(select문 실행결과집합)얻기:"+rs);
		
		while(rs.next()) {
			int deptno=rs.getInt("deptno");
			String dname=rs.getString("dname");
			String loc=rs.getString("loc");
			System.out.println(deptno+"\t"+dname+"\t"+loc);
		}
		
		/*
		 * 6.연결객체해지(resource해지) close
		 */
		rs.close();
		stmt.close();
		con.close();
		System.out.println("6.연결객체닫기(close)");
	}

}
