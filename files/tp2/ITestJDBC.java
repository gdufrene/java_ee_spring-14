package jdbc;
import java.sql.SQLException;
import java.sql.Connection;

public interface ITestJDBC {
  
  public Connection getConnection();
  
	// JDBC1
	  public void connect() throws SQLException, ClassNotFoundException;
	  public boolean checkPasswordBasic( String email, String pwd ) throws SQLException;
	
	// JDBC2
	  public boolean exists(String email) throws SQLException;
	  public void addMember(String lastname, String firstname, String email, String password) throws SQLException;
	  public boolean checkPasswordWithSum( String email, String pwd ) throws SQLException;

}