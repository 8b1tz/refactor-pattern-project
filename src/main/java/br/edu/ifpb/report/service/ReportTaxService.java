package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.Report;

public class ReportTaxService<TaxReport> extends ReportServiceAbstract<TaxReport>{
	
	private Report taxReport;
	
	public void generateReport() {
			taxReport.generate();
	}

	
}
