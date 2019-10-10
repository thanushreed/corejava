package com.quinnox.jdbc;
import java.sql.*;
public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		Statement stmt;
		PreparedStatement pstmt;
		ResultSet rs;
		int cnt=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","thanu","thanu4949");
			String sql= "Delete from training where rtrim(employee_name) like \'a%\'";
			System.out.println(" ");
			stmt=con.createStatement();
			cnt=stmt.executeUpdate(sql);
			if(cnt>0) {
				System.out.println("Record for young is deleted");
			}
			con.close();
		}
			catch(Exception ce)
			{
				System.out.println(ce);
				
			}

	}

}
