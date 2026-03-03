public class ContractualEmployee extends Employee {

    puiblic ContractualEmployee(String employeeId, String firstName,
                                String lastName, String position, 
                                double hourlyRate, doublehoursWorked) {
        super(employeeId, firstName, lastName, position, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateGrossPay() {
        return hourlyRate * hoursWorked;
    }
}
