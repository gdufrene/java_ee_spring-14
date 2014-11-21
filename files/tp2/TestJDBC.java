package jdbc;
import java.sql.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class TestJDBC implements ITestJDBC {
  
  Connection conn;
  
  public Connection getConnection() {
    return conn;
  }
  
  // JDBC1 ******************************
  public void connect() throws SQLException, ClassNotFoundException {
    Class.forName("org.sqlite.JDBC");
    conn = DriverManager.getConnection("jdbc:sqlite:data.db");
  }
  
  public boolean checkPasswordBasic( String email, String pwd ) throws SQLException {
    Statement statement = conn.createStatement();
    statement.setQueryTimeout(30);  // set timeout to 30 sec.
    // TODO: Change the request to search for member
    ResultSet rs = statement.executeQuery( "SELECT 1 FROM member" );
    // TODO: Use ResultSet to check if password match
    return false;
  }
  
  // JDBC2 ******************************
  public boolean exists(String email) throws SQLException {
    // TODO: implement this function
    return false;
  }
  
  public void addMember(String lastname, String firstname, String email, String password) throws SQLException {
    // TODO: implement this function
  }
  
  public boolean checkPasswordWithSum( String email, String pwd ) throws SQLException {
    // TODO: implement this function
    return false;
  }
  
  public static void main(String argv[]) throws Exception {
    TestJDBC db = new TestJDBC();
    db.connect();
    System.out.println( "Test du mot de passe");
    System.out.println(
      " ==> " + db.checkPasswordBasic( "guillaume.dufrene@webpulser.com", "test" )
    );
  }
  
}