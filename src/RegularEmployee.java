public class RegularEmployee extends Employee {

  public RegularEmployee(String employeeId, String firstName, String lastName,
                         String position, double basicSalary) {
    super(employeeId,firstName, lastName, position, basicSalary);
  }

  @Override
  public double calculateGrossPay() {
    return basicSalary;
  }
}
