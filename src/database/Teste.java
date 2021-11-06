package database;

import controller.Report;
import controller.ReportFactory;

public class Teste {
	public static void main(String[] args) {
//		ConnectorService connector1 = new MySQLDatabase();
//		connector1.createConnection();
//		connector1.runQuery();
//		
//		
//		ConnectorService connector2 = new PostgreSQLDatabase();
//		connector2.createConnection();
//		connector2.runQuery();
		
		ConnectorService connector = new PostgreSQLDatabase();
		ReportFactory factory = new ReportFactory();
		Report r = factory.criarReport(connector);
		r.generate();
	}
}
