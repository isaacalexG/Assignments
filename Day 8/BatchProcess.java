package day8;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class BatchProcess {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "password"); //
			st = con.createStatement();

			st.addBatch("INSERT INTO employees VALUES (1010, 'test', '1', 'x0001', ' ', 0, 1001 , 'test')");
			st.addBatch("INSERT INTO employees VALUES (1011, 'test', '2', 'x0001', ' ', 0, 1001 , 'test')");
			st.executeBatch();
			
			PreparedStatement pst = con.prepareCall("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ? ,?)");
			pst.setInt(1, 1020);
			pst.setString(2, "fNameA");
			pst.setString(3, "lNameB");
			pst.setString(4, "x0003");
			pst.setString(5, " ");
			pst.setInt(6, 0);
			pst.setInt(7, 1001);
			pst.setString(8, "test");
			pst.addBatch();

			pst.setInt(1, 1021);
			pst.setString(2, "fName2A");
			pst.setString(3, "lName2B");
			pst.setString(4, "x0003");
			pst.setString(5, " ");
			pst.setInt(6, 0);
			pst.setInt(7, 1001);
			pst.setString(8, "test");
			pst.addBatch();
			
			pst.executeBatch();

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
