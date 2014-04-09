package databaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
  
	private String className = "com.mysql.jdbc.Connection";
	private String userName = "myuser";
	private String password = "12345";
	private String url = "jdbc:mysql://localhost/examregistrationdb";
	private static ConnectionManager connectionInstance = null;
  
  public ConnectionManager(){
	  
  }
  
  public static synchronized ConnectionManager getInstance() {
	if(connectionInstance == null) {
	  connectionInstance = new ConnectionManager(); 		
	}
	return connectionInstance;
  }
  
  public Connection getConnection(){
	  
	  Connection conn = null;
	  try {
		  Class.forName(className);
		  conn = DriverManager.getConnection (url, userName, password);
		  System.out.println("Connection Established");
	  }  catch (ClassNotFoundException e) {
		  e.printStackTrace();
	  }	 catch (SQLException e) {
		  System.out.println("SQL Exception");
		  e.printStackTrace();
	  }
	  return conn;
  }

  public void closeConnection(Connection conn){
	  try {
		  conn.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
	  }
  } 
}
