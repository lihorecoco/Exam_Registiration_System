package testt;

import static org.junit.Assert.*;

import org.junit.Test;


import databaseConnection.ConnectionManager;

public class ConnectionTest {

	@Test
	public void testDBConnection() {
		ConnectionManager cm = ConnectionManager.getInstance();
		java.sql.Connection con = cm.getConnection();
		assertNotNull(con);
	}

	
}
