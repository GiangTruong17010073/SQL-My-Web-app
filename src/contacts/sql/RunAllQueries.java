package contacts.sql;

import java.sql.Connection;
import java.sql.SQLException;

import contacts.sql.ConnectionFactory;



public class RunAllQueries {

public static void main(String[] args) throws SQLException {
		
		Connection connectionDb = new ConnectionFactory()
				.getConnection("jdbc:mysql://localhost/");
		
		// Create database
		
		new DropDatabase(connectionDb).run();
		new CreateDatabase(connectionDb).run();

		connectionDb.close();
		
		//Create tables 
		
		Connection connectionTable = new ConnectionFactory()
				.getConnection("jdbc:mysql://localhost/contacts");
		
		//Create
		new CreateContacts(connectionTable).run();
		
		
		
		//Insert
		new InsertContacts(connectionTable).run();
		
		connectionTable.close();
	}
	
}
