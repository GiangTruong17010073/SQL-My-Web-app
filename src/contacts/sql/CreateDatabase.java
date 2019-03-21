package contacts.sql;


import java.sql.Connection;
import java.sql.SQLException;

public class CreateDatabase {
	private final Connection connection;
	private final String sqlQuery;
	
	public CreateDatabase(Connection connection) {
		this.connection = connection;
		this.sqlQuery = "CREATE DATABASE IF NOT EXISTS contacts;";
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  CreateDatabase started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DB \'contacts\' successfully created");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  CreateDatabase ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
