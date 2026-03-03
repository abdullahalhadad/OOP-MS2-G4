public class HRUser extends User {

    public HRUser(String username, String password) {
        super(username, password, "HR");
    }

    @Override
    public void accessSystem() {
        System.out.println("Accessing HR management panel...");
    }

    // HR-specific responsibilities
    public void createEmployee(Employee employee) {
        System.out.println("HR created employee: " + employee);
    }

    public void updateEmployee(Employee employee) {
        System.out.println("HR updated employee: " + employee);
    }

    public void deleteEmployee(String employeeId) {
        System.out.println("HR deleted employee with ID: " + employeeId);
    }
}

