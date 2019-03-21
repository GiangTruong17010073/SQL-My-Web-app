package contacts.sql;


import java.sql.Connection;
import java.sql.SQLException;

public class DropDatabase {
	private final Connection connection;
	private final String sqlQuery;
	
	public DropDatabase(Connection connection) {
		this.connection = connection;
		this.sqlQuery = "DROP DATABASE IF EXISTS contacts;";
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">DropDatabase started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DB \'contacts\' successfully dropped");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<DropDatabase ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}

}
