package br.cesul.lista04.ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesmanTest {

    private Salesman salesman;

    @BeforeEach
    public void setup() {
        this.salesman = new Salesman("João", 1000, 2000, SeniorityLevel.SENIOR);
    }

    @Test
    public void givenConstructorParameters_whenCreatingSalesman_thenSetsAttributesCorrectly() {
        assertEquals("João", salesman.getName());
        assertEquals(1000, salesman.getSalary());
        assertEquals(2000, salesman.getSalesTarget());
        assertEquals(SeniorityLevel.SENIOR, salesman.getSeniority());
        assertEquals(0, salesman.getCashSales());
        assertEquals(0, salesman.getInstallmentsSales());
    }

    @Test
    public void givenCashSalesWithoutSalesTarget_whenGetFinalSalary_ReturnsSalary() {
        salesman.setCashSales(1500);
        assertEquals(1030, salesman.getFinalSalary(),0.01);
    }

    @Test
    public void givenCashSalesWithSalesTarget_whenGetFinalSalary_ReturnsSalary() {
        var salesman = new Salesman("João", 1000, 2000, SeniorityLevel.SENIOR);
        salesman.setCashSales(2500);
        assertEquals(1250, salesman.getFinalSalary(),0.01);
    }

    @Test
    public void givenInstallmentSalesWithoutSalesTarget_whenGetFinalSalary_ReturnsSalary() {
        salesman.setInstallmentsSales(1500);
        assertEquals(1015, salesman.getFinalSalary(),0.01);
    }

    @Test
    public void givenInstallmentSalesWithSalesTarget_whenGetFinalSalary_ReturnsSalary() {
        salesman.setInstallmentsSales(2500);
        assertEquals(1225, salesman.getFinalSalary(),0.01);
    }

    @Test
    public void givenSeniorityJunior_whenGetFinalSalary_ReturnsSalaryWithCorrectBonus() {
        salesman.setSeniority(SeniorityLevel.JUNIOR);
        salesman.setCashSales(1500);
        salesman.setInstallmentsSales(1000);

        assertEquals(1090, salesman.getFinalSalary(),0.01);
    }

    @Test
    public void givenSeniorityMid_whenGetFinalSalary_ReturnsSalaryWithCorrectBonus() {
        salesman.setSeniority(SeniorityLevel.MIDLEVEL);
        salesman.setCashSales(1500);
        salesman.setInstallmentsSales(1000);

        assertEquals(1190, salesman.getFinalSalary(),0.01);
    }

    @Test
    public void givenSenioritySenior_whenGetFinalSalary_ReturnsSalaryWithCorrectBonus() {
        salesman.setCashSales(1500);
        salesman.setInstallmentsSales(1000);

        assertEquals(1240, salesman.getFinalSalary(), 0.01);
    }
}
