import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.SQLException;
		import java.sql.Statement;
		public class mydb {

			public static void main(String[] args) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","root");
					
					Statement stmt= conn.createStatement();
					
					stmt.executeUpdate("CREATE DATABASE data");
					
					System.out.println("Database created in MySQL");
					
					conn.close();
					stmt.close();
					
					
				} catch (ClassNotFoundException | SQLException e) {
					
					e.printStackTrace();
				}
				

			}

		}