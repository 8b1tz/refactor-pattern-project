package br.edu.ifpb.report.service;

import br.edu.ifpb.report.controller.Report;

public class ReportExpenseReport<ExpenseReport> {
	
	private Report expenseReport;
	
	public void generateReport(String type) {
			expenseReport.generate();
	}
}
