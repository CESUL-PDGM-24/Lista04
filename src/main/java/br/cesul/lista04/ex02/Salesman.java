package br.cesul.lista04.ex02;

public class Salesman {

    private static final double CASH_SALES_COMISSION = 0.02;
    private static final double INSTALLMENT_SALES_COMISSION = 0.01;

    private static final double BONUS_SENIOR = 0.2;
    private static final double BONUS_MID = 0.15;
    private static final double BONUS_JUNIOR = 0.05;

    private String name;

    private double salary;

    private double cashSales;

    private double installmentsSales;

    private double salesTarget;

    private SeniorityLevel seniority;

    public Salesman(String name, double salary, double salesTarget, SeniorityLevel seniority) {
        this.name = name;
        this.salary = salary;
        this.salesTarget = salesTarget;
        this.seniority = seniority;
    }

    public double getFinalSalary() {
        double finalSalary = salary + (cashSales * CASH_SALES_COMISSION) +
                (installmentsSales * INSTALLMENT_SALES_COMISSION);

        double totalSales = cashSales + installmentsSales;

        if (totalSales < salesTarget) {
            return finalSalary;
        }

        return finalSalary + getBonus();
    }

    private double getBonus() {
        if (seniority == SeniorityLevel.JUNIOR) {
            return salary * BONUS_JUNIOR;
        }

        if (seniority == SeniorityLevel.MIDLEVEL) {
            return salary * BONUS_MID;
        }

        return salary * BONUS_SENIOR;
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

    public SeniorityLevel getSeniority() {
        return seniority;
    }
}
