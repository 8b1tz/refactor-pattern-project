package br.edu.ifpb.report.service;

import br.edu.ifpb.report.database.DatabaseConnectorFactory;

public abstract class ReportServiceAbstract<E> {
	
	public abstract DatabaseConnectorFactory<E> getConnection();

}
