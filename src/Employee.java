public abstract class Employee {

    //Identity
    private String employeeId;
    private String firstName;
    private String lastName;
    private String position;

    // Payroll fields
    protected double basicSalary;
    protected double hourlyRate;
    protected double hoursWorked;

    public Employee(String employeeId, String firstName, String lastName,
                    String position, double basicSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    // Abstract method (polymorphism)
    public abstract double calculateGrossPay();

    // shared payroll computations
    public double computeSSS() {
        return calculateGrossPay() * 0.045; //example rate
    }

    public double computePhilHealth() {
        return calculateGrossPay() * 0.02;
    }

    public double computePagIBIG() {
        return 100; //fixed sample
    }

    public double computeTax() {
        return calculateGrossPay() * 0.10;
    }

    public double computeNetPay() {
        return calculateGrossPay()
                - computeSSS()
                - computePhilHealth()
                - computePagIBIG()
                - computeTax();
    }

    // Getters & Setters
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeeId(String employeeId) { this.employeeId = employeeId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

     public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public double getBasicSalary() { return basicSalary; }
    public void setBasicSalary(double basicSalary) {
        if (basicSalary > 0) {
            this.basicSalary = basicSalary;
        }
    }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        }
    }

    public double getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(double hoursWorked) {
        if (hoursWorked >= 0) {
            this.hoursWorked = hoursWorked;
        }
    }

    @Override
    public String toString() {
        return employeeId + " - " + firstName + " " + lastName;
    }
}
    
 
