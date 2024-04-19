package br.cesul.lista04.ex01;

public class Loan {

    private final double amount;

    private final double interest;

    private final int installments;

    public Loan(double amount, double interest, int installments) {
        this.amount = amount;
        this.interest = interest;
        this.installments = installments;
    }

    public double getInstallmentValue() {
        return (amount * (1 + (interest / 100 * installments))) / installments;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterest() {
        return interest;
    }

    public int getInstallments() {
        return installments;
    }
}
