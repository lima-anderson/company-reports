package controller;

import database.ConnectorService;

public class Expense extends Report {

	public Expense(ConnectorService connector) {
		super(connector);
	}

	public void convertToXLS() {
		System.out.println("Converting To XLS...");
	}

}
