package br.edu.ifpb;

import br.edu.ifpb.report.controller.TaxReport;
import br.edu.ifpb.report.service.ReportExpenseService;
import br.edu.ifpb.report.service.ReportTaxService;

public class Main {

    public static void main(String[] args) {
        ReportTaxService<TaxReport> reportService = new ReportTaxService<TaxReport>();
        ReportTaxService<ReportExpenseService> reportService2 = new ReportTaxService<ReportExpenseService>();
    }

}
