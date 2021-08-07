package br.edu.ifpb.report.database;

public class PostgreSQLDatabaseConnector<E> implements DatabaseConnectorFactory<E> {

	public void openConnection() {
		System.out.println("Create postgres connetion");
	}

	public void executeQuery(String query) {
		System.out.println("Run SQL query");
	}

}
