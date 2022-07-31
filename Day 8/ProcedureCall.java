package day8;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureCall {

	public static void main(String[] args) {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "password"); //
			
			CallableStatement cs = con.prepareCall("{call empprocedure(?,?)}");
			cs.setInt(1, 1003);
			cs.setString(2, "test");

			System.out.println("Success");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
