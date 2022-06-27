package statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatementMain {

	public static void main(String[] args)throws Exception {
		
		/*******************************************/
		String driverClass="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper00";
		String password="jdeveloper00";
		/*******************************************/
		
		String selectOneSql=
				"select* from guest where guest_no=2";
		String selectAllSql=
				"select * from guest";
		String insertSql=
				"insert into guest values(guest_guest_no_seq.nextval,'김경호',sysdate,'guard@gmail.com','http://www.itwill.co.kr','방명록사용법','방명록처럼 사용하시면됩니다.')";                
		String updateSql=
				"update guest set guest_name='이름수정',guest_date=sysdate,guest_email='change@gmail.com',guest_homepage='http://www.change.com',guest_title='타이틀변경',guest_content='내용변경' where guest_no=1";
		String deleteSql="delete from guest where guest_no=1";
		
		Class.forName(driverClass);
		Connection con= DriverManager.getConnection(url, user, password);
		
		Statement stmt=con.createStatement();
		System.out.println(stmt);

	}

}
