package day8;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Metadata {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "SQLUser#375"); //
			
			DatabaseMetaData db = con.getMetaData();
			System.out.println(db.getDatabaseProductName());
			System.out.println(db.getDatabaseMajorVersion());
			System.out.println(db.getDriverName());
			System.out.println(db.getSchemas());
			System.out.println();
			
			pst = con.prepareStatement("SELECT * FROM employees WHERE employeeNumber = 1001");
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsMData = rs.getMetaData();
			System.out.println(rsMData.getColumnCount());
			System.out.println(rsMData.getColumnName(1) + " " + rsMData.getColumnTypeName(1));
			System.out.println(rsMData.getColumnName(2) + " " + rsMData.getColumnTypeName(2));
			System.out.println(rsMData.getColumnName(3) + " " + rsMData.getColumnTypeName(3));
			System.out.println(rsMData.getColumnName(4) + " " + rsMData.getColumnTypeName(4));
			System.out.println(rsMData.getColumnName(5) + " " + rsMData.getColumnTypeName(5));
			System.out.println(rsMData.getColumnName(6) + " " + rsMData.getColumnTypeName(6));

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
