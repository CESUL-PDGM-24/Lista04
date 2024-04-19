package br.cesul.lista04.ex02;

public class Salesman {

    private String name;

    private double salary;

    private double cashSales;

    private double installmentsSales;

    private double salesTarget;

    private String seniority;

    public Salesman(String name, double salary, double salesTarget, String seniority) {
        this.name = name;
        this.salary = salary;
        this.salesTarget = salesTarget;
        this.seniority = seniority;
    }

    public void setCashSales(double cashSales) {
        this.cashSales = cashSales;
    }

    public void setInstallmentsSales(double installmentsSales) {
        this.installmentsSales = installmentsSales;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getCashSales() {
        return cashSales;
    }

    public double getInstallmentsSales() {
        return installmentsSales;
    }

    public double getSalesTarget() {
        return salesTarget;
    }

    public String getSeniority() {
        return seniority;
    }
}
