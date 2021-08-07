package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnectorFactory;
import br.edu.ifpb.report.database.MysqlDatabaseConnector;

public class TaxReport extends Report {

	private DatabaseConnectorFactory<TaxReport>  connector = new MysqlDatabaseConnector<TaxReport>();

	public void createDatabaseConnection() {
		System.out.println("Creating Database Connection...");
		connector.openConnection();
	}

	public void executeQuery() {
		System.out.println("Executing MySQL Query...");
		String query = "SELECT * FROM taxes";
		connector.executeQuery(query);
	}

	public void convert() {
		System.out.println("Converting To PDF...");
	}

}
