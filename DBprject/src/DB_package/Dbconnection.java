package DB_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {

	
	private String url = "jdbc:postgresql://localhost:5432/";
    private String dbName = "DB_eser";
    private String username = "postgres";
    private String password = "root";
    Statement st;
    
	public Dbconnection() throws SQLException {
		
		Connection conn =  DriverManager.getConnection(url+dbName, username, password );
        st =  conn.createStatement();
    createTabstudents();    
	}
	
	
	public void createTabstudents() throws SQLException {
		
		String sql = "CREATE TABLE IF NOT EXISTS school_students "
				+ "(id SERIAL PRIMARY KEY,"
				+ " name VARCHAR NOT NULL , "
				+ "lastname VARCHAR NOT NULL ,"
				+ " gender CHAR NOT NULL, birthdate DATE ,"
				+ " avg DECIMAL , "
				+ "min_vote DECIMAL, "
				+ "max_vote DECIMAL)"  ;
	st.executeUpdate(sql);	
	}
	
	
	
	
	
	
    
    
    
    
    
	
	
	
	
}
