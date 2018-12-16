package singletonPack;
import java.sql.*;

public class MyConnection {
	
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost/singleton";
	private String usr="root";
	private String pswd="root";
	private static MyConnection instance = null;
	private Connection connect;
	
	public static MyConnection getInstance() {
		
		if(instance == null) {
			
			instance = new MyConnection();
			
		}
		
		return instance;
		
	}
	
	private Connection createConnection() {
		
		Connection con = null;
		
		try {
			
			con = DriverManager.getConnection(url, "root", "root");
			
		}
		
		catch(SQLException error) {

			System.out.println("Error!");
			error.printStackTrace();
			
		}
		
	 	return con;	
		
	}
	
	public Connection getConnection() {
	
		return connect;
		
	}
	
	
	private MyConnection() {
		
		connect = createConnection();
				
	}
	
}
