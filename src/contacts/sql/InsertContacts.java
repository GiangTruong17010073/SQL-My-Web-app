package contacts.sql;


import java.sql.Connection;
import java.sql.SQLException;

public class InsertContacts {
	private final Connection connection;
	private final String sqlQuery;
	
	public InsertContacts(Connection connection) {
		this.connection = connection;
		
		this.sqlQuery = "INSERT INTO contacts (name, email, address, date_of_register) "
				+ 	"values "
				
				+ 	"('Giang', 'giang.truong170173@vnuk.edu.vn', '1A Ung Van khiem', '2019-10-22' ) "
				+ ";"
			;
	}
	
	public void run() throws SQLException {

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(">  InsertContacts started");
		
		try {
	        connection.prepareStatement(sqlQuery).execute();
	        System.out.println("   DATA successfully loaded in \'contacts\'");
		
		}
		
		catch (Exception e) {
	        e.printStackTrace();
	        connection.close();
		}
		
		finally {
			System.out.println("<  InsertContacts ended");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("");
		}
			
	}
}
