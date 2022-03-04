package com.company;
//import invoice java class
import com.company.Invoice;
import java.util.*;
import java.util.stream.Collectors;

public class RefactorHW {
    List<Invoice> invoices = new ArrayList<>();
    List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
    List<Integer> ids = new ArrayList<>();
    List<Integer> firstFiveId = new ArrayList<>();

    //using stream function, find getCustomer equal to Customer.Oracle and getTitle that contains "Training" then add to oracleAndTraInvoices
    public void findOracleAndTrainingInvoices() {
        oracleAndTrainingInvoices = invoices.stream().filter(invoice -> invoice.getCustomer().equals("Oracle") && invoice.getTitle().contains("Training")).collect(Collectors.toList());
    }

    //using stream function, compare 2 parameter invoices.getAmount() and return int using stream function
    public int compareAmount() {
        return invoices.stream().mapToInt(invoice -> invoice.getAmount()).sum();
    }


    //using stream function, return into ids inv.getId() from oracleAndTrainingInvoices
    public void getIds() {
        ids = oracleAndTrainingInvoices.stream().map(inv -> inv.getId()).collect(Collectors.toList());
    }


    //using stream function, loop 5 times and return in firstFiveId the first 5 id of oracleAndTraInvoices using stream
    public void getFirstFiveId() {
        firstFiveId = ids.stream().limit(5).collect(Collectors.toList());
    }

}
