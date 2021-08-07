package br.edu.ifpb.report.database;

public interface DatabaseConnectorFactory<E> {

	public void openConnection();

	public void executeQuery(String query);
}
