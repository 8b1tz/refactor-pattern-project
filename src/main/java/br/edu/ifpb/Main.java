package br.edu.ifpb;

import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.service.ReportExpenseReport;
import br.edu.ifpb.report.service.ReportTaxService;

public class Main {

    public static void main(String[] args) {
        ReportTaxService<TaxReport> reportService = new ReportTaxService<TaxReport>();
        ReportTaxService<ReportExpenseReport> reportService2 = new ReportTaxService<ReportExpenseReport>();
    }

}
