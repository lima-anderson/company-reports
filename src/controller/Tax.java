package controller;

import database.ConnectorService;

public class Tax extends Report {

	public Tax(ConnectorService connector) {
		super(connector);
	}

	public void convertToPDF() {
		System.out.println("Converting To PDF...");
	}
}
