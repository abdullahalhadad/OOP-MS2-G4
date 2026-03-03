public class AdminEmployee extends Employee
        implements CrudOperations, Calculation, AttendanceOperations {

    public AdminEmployee(String id, String fname, String lname, double salary) {
        super(id, fname, lname, "Admin", salary);
    }

    @Override
    public String getRole() {
        return "Admin";
    }

    // CRUD
    public void createEmployee(Employee e) {}
    public Employee readEmployee(String id) { return null; }
    public void updateEmployee(Employee e) {}
    public void deleteEmployee(String id) {}

    // Calculation
    public double calculateSalary() { return basicSalary; }
    public double calculateDeductions() { return basicSalary * 0.12; }
    public double calculateNetPay() { return calculateSalary() - calculateDeductions(); }

    // Attendance
    public void timeIn() {}
    public void timeOut() {}
    public int computeTotalHours() { return 8; }
}
