public abstract class Employee {

    protected String employeeId;
    protected String firstName;
    protected String lastName;
    protected String position;
    protected double basicSalary;

    public Employee(String employeeId, String firstName, String lastName,
                    String position, double basicSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public Employee() {}

    // Abstract behavior (must be implemented by child classes)
    public abstract String getRole();

    @Override
    public String toString() {
        return employeeId + " - " + firstName + " " + lastName + " (" + position + ")";
    }
}

public String getEmployeeId() { return employeeId; }
public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

public String getFirstName() { return firstName; }
public void setFirstName(String firstName) { this.firstName = firstName; }

public String getLastName() { return lastName; }
public void setLastName(String lastName) { this.lastName = lastName; }

public double getBasicSalary() { return basicSalary; }
public void setBasicSalary(double basicSalary) { this.basicSalary = basicSalary; }