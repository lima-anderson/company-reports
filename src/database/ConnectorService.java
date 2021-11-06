package database;

public abstract class ConnectorService {

	public final void connector() {
		this.createConnection();
		this.runQuery();
	}

	abstract public void createConnection();

	abstract public void runQuery();
}