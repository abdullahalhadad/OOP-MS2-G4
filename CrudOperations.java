public interface CrudOperations {
    void createEmployee(Employee employee);
    Employee readEmployee(String employeeId);
    void updateEmployee(Employee employee);
    void deleteEmployee(String employeeId);
}