
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) {
		
		try {
			
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root","root");
			
			Statement stmt = conn.createStatement();


			String sql = "UPDATE Employee SET Designation='Java Developer' WHERE EmpId=101";

			stmt.executeUpdate(sql);
			
			System.out.println("Employee Table Updated");
			
			conn.close();
			stmt.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}