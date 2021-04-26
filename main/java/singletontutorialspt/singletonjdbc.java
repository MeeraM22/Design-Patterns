package singletontutorialspt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class singletonjdbc {
public static Connection con;
private void GetConnection() {
	
}
static {
	String url="jdbc:mysql://localhost:3306/hr";
	String user="root";
	String password="root";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection(url,user,password);
	}
	catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
public static Connection getConnection() {
	return con;
}
}
