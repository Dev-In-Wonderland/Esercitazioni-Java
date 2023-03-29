package DB_package;

import java.sql.SQLException;

public class Main {

	
	public static void main (String[] args) {
	
		
		try {
			Dbconnection db = new Dbconnection ();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
