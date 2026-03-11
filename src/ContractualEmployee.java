public class ContractualEmployee extends Employee {

    public ContractualEmployee(String employeeId, String firstName, String lastName,
                               String position, double hourlyRate, double hoursWorked) {

        super(employeeId, firstName, lastName, position);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }
}
