package day8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrepareStatements{

	public static void main(String[] args) throws SQLException{
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "password"); //
			
			pst = con.prepareStatement("INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, jobTitle) "
					+ "VALUES (1033, 'test', 'b', 'x0000', ' ', 0, 'test')");
			System.out.println(pst.executeUpdate());
			
			pst = con.prepareStatement("UPDATE employees SET lastName = 'Patters' where firstName = 'Mary'");
			System.out.println(pst.executeUpdate());

			pst = con.prepareStatement("SELECT * FROM employees");
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(rs.getInt("employeeNumber") + " " + rs.getString("firstName") + " " + rs.getString("lastName"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
