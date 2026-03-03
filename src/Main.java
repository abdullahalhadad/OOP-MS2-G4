public classs Main {

  public static void main(String[] args) {

    // Create regular employee
    Employee regular = new RegularEmployee(
            "E001",
            "Juan",
            "Dela Cruz",
            "Staff",
            30000
      );

      // Create Contractual Employee
        Employee contractual = new ContractualEmployee(
                "E002",
                "Maria",
                "Santos",
                "Contractual",
                500,      // hourly rate
                160       // hours worked
        );

        // Create Payroll Processor
        PayrollProcessor processor = new PayrollProcessor();

        // Process Regular Employee
        System.out.println("===== REGULAR EMPLOYEE =====");
        processor.displayPayrollSummary(regular);

        System.out.println();

        // Process Contractual Employee
        System.out.println("===== CONTRACTUAL EMPLOYEE =====");
        processor.displayPayrollSummary(contractual);

        System.out.println();

        // Test method overloading
        double bonusSalary = processor.calculateSalary(regular, 5000);
        System.out.println("Regular with Bonus: " + bonusSalary);
    }
}
