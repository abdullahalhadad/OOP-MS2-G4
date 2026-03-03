public class HREmployee extends Employee
        implements CrudOperations, AttendanceOperations {

    public HREmployee(String id, String fname, String lname, double salary) {
        super(id, fname, lname, "HR", salary);
    }

    @Override
    public String getRole() {
        return "HR";
    }

    // CRUD
    @Override
    public void createEmployee(Employee employee) {
        System.out.println("HR created employee: " + employee);
    }

    @Override
    public Employee readEmployee(String employeeId) {
        return null; // connect to CSV or DB
    }

    @Override
    public void updateEmployee(Employee employee) {
        System.out.println("HR updated employee.");
    }

    @Override
    public void deleteEmployee(String employeeId) {
        System.out.println("HR deleted employee.");
    }

    // Attendance
    @Override
    public void timeIn() {
        System.out.println("HR time-in recorded.");
    }

    @Override
    public void timeOut() {
        System.out.println("HR time-out recorded.");
    }

    @Override
    public int computeTotalHours() {
        return 8;
    }
}
