package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {
	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/quanlyhieusach";
			String username="root";
			String password = "sapassword";
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, username, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	public static void main(String[] args) {
		Connection con = getConnection();
		if( con != null) {
			System.out.println("Connect Success");
		}else
			System.out.println("Connect Error");
	}
}
