package day8;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels", "root", "password");
			con.setAutoCommit(false);

			pst = con.prepareStatement("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ? ,?)");
			pst.setInt(1, 1006);
			pst.setString(2, "fName");
			pst.setString(3, "lName");
			pst.setString(4, "x0001");
			pst.setString(5, " ");
			pst.setInt(6, 0);
			pst.setInt(7, 1001);
			pst.setString(8, "test");
			System.out.println(pst.executeUpdate());

			pst = con.prepareStatement("INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ? ,?)");
			pst.setInt(1, 1007);
			pst.setString(2, "fName2");
			pst.setString(3, "lName2");
			pst.setString(4, "x0003");
			pst.setString(5, " ");
			pst.setInt(6, 0);
			pst.setInt(7, 1001);
			pst.setString(8, "test");
			System.out.println(pst.executeUpdate());
			
			con.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
