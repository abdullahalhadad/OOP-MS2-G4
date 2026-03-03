public class FinanceEmployee extends Employee implements Calculation {

    public FinanceEmployee(String id, String fname, String lname, double salary) {
        super(id, fname, lname, "Finance", salary);
    }

    @Override
    public String getRole() {
        return "Finance";
    }

    @Override
    public double calculateSalary() {
        return basicSalary;
    }

    @Override
    public double calculateDeductions() {
        return basicSalary * 0.10;
    }

    @Override
    public double calculateNetPay() {
        return calculateSalary() - calculateDeductions();
    }
}
