package controller;

import database.ConnectorService;

public class Report {

	public ConnectorService connector;

	public Report(ConnectorService connector) {
		this.connector = connector;
	}

	public void generate() {
		connector.createConnection();
		connector.runQuery();
	}

}
