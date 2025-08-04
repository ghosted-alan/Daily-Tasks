package javadbconnect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/wiprodb";
		String uname = "root";
		String pwd = "Alan@0211";
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, uname, pwd);
			String sql = "insert into users(username,password) values(?,?)";
			CallableStatement cs = conn.prepareCall(sql);
			cs.setString(1, "jack");
			cs.setString(2, "123456");
			cs.execute();
			System.out.println("Record Inserted Successfully!!!");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
