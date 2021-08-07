package br.edu.ifpb.report.controller;

import br.edu.ifpb.report.database.DatabaseConnectorFactory;
import br.edu.ifpb.report.database.PostgreSQLDatabaseConnector;

public class ExpenseReport extends Report {

	private DatabaseConnectorFactory<ExpenseReport> connector = new PostgreSQLDatabaseConnector<ExpenseReport>();

	public void createDatabaseConnection() {
		System.out.println("Creating Database Connection...");
		connector.openConnection();
	}

	public void executeQuery() {
		System.out.println("Executing Postgres Query...");
		String query = "SELECT * FROM expenses";
		connector.executeQuery(query);
	}

	public void convert() {
		System.out.println("Converting To XLS...");
	}

}
