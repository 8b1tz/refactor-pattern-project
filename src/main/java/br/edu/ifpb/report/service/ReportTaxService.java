package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.Report;

public class ReportTaxService<TaxReport> {
	
	private Report taxReport;
	
	public void generateReport(String type) {
			taxReport.generate();
	}
}
