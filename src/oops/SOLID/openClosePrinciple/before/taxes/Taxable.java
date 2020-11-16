package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public interface Taxable {
    public double calculate(Employee employee);
}
