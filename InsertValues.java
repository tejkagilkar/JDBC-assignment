import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) {
		
		try {
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root","root");
			
				Statement stmt = conn.createStatement();
			

				String sql = "INSERT INTO Employee (EmpId,EmpName,Designation,Age) VALUES (?,?,?,?)";
			
								
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setInt(1,101);
				ps.setString(2,"tejaswini kagilkar");
				ps.setString(3,"Software Developer");
				ps.setInt(4,24);
				
				ps.executeUpdate();
				
				System.out.println("Values inserted in Employee Table");
				
				conn.close();
				stmt.close();
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}