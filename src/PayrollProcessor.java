pubclic class PayrollProcessor {

  // Basic salary processing
    public double calculateSalary(Employee employee) {
        return employee.computeNetPay();
    }

    // Overloaded method with bonus
    public double calculateSalary(Employee employee, double bonus) {
        return employee.computeNetPay() + bonus;
    }

    // Overloaded method with bonus and allowance
    public double calculateSalary(Employee employee, double bonus, double allowance) {
        return employee.computeNetPay() + bonus + allowance;
    }

    // Optional: display payroll summary
    public void displayPayrollSummary(Employee employee) {
        System.out.println("Employee: " + employee.getEmployeeId());
        System.out.println("Gross Pay: " + employee.calculateGrossPay());
        System.out.println("SSS: " + employee.computeSSS());
        System.out.println("PhilHealth: " + employee.computePhilHealth());
        System.out.println("Pag-IBIG: " + employee.computePagIBIG());
        System.out.println("Tax: " + employee.computeTax());
        System.out.println("Net Pay: " + employee.computeNetPay());
    }
}
