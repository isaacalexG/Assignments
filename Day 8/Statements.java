package day8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class Statements {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "password"); //
			st = con.createStatement();
			rs = st.executeQuery("SELECT * FROM employees");
			
			
			while(rs.next()) {
				System.out.println(rs.getString("firstName") + " " + rs.getString("lastName"));
			}
			st.executeUpdate("UPDATE employees SET lastName = 'Murphie' where firstName = 'Diane'");
			st.executeUpdate("INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, jobTitle) "
					+ "VALUES (1032, 'test', 'a', 'x0000', ' ', 0, 'test')");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			st.close();
			rs.close();
		}
		
	}

}