package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator implements Taxable{
    private final int INCOME_TAX_PERCENTAGE = 30;
    private final int PROFESSIONAL_TAX_PERCENTAGE = 2;
    private final int EDUCATION_CESS_PERCENTAGE = 1;

    @Override
    public double calculate(Employee employee) {
        return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0 +
                (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100.0 +
                (employee.getMonthlyIncome() * EDUCATION_CESS_PERCENTAGE) / 100.0;
    }
}
