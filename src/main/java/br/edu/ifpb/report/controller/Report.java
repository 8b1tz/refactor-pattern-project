package br.edu.ifpb.report.controller;

public abstract class Report {

	public void generate() {
		createDatabaseConnection();
		executeQuery();
		convert();
	}

	protected abstract void convert();

	protected abstract void executeQuery();

	protected abstract void createDatabaseConnection();

}
