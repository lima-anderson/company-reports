package database;

public class PostgreSQLDatabase extends ConnectorService {

	@Override
	public void createConnection() {
		System.out.println("Create Postgres connection");
	}

	@Override
	public void runQuery() {
		System.out.println("Run SQL query");

	}
}
