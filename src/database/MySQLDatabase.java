package database;

public class MySQLDatabase extends ConnectorService {

	@Override
	public void createConnection() {
		System.out.println("Create MySQL connection");
	}

	@Override
	public void runQuery() {
		System.out.println("Run SQL query");
	}

}
