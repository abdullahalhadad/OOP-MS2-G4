import java.util.HashMap;
import java.util.Map;

public class PayrollProcessor {

    private final Map<Double, Double> sssTable;

    public PayrollProcessor() {
        this.sssTable = initSSSTable();
    }

    private Map<Double, Double> initSSSTable() {
        Map<Double, Double> table = new HashMap<>();

        table.put(4250.0, 180.0);
        table.put(4750.0, 202.5);
        table.put(5250.0, 225.0);
        table.put(5750.0, 247.5);
        table.put(6250.0, 270.0);
        table.put(6750.0, 292.5);
        table.put(7250.0, 315.0);
        table.put(7750.0, 337.5);
        table.put(8250.0, 360.0);
        table.put(8750.0, 382.5);

        table.put(Double.MAX_VALUE, 945.0);

        return table;
    }

    public double calculateSSS(double grossPay) {
        double contribution = 0;

        for (Map.Entry<Double, Double> entry : sssTable.entrySet()) {
            if (grossPay <= entry.getKey()) {
                contribution = entry.getValue();
                break;
            }
        }

        return contribution;
    }

    public double calculatePhilHealth(double grossPay) {
        return grossPay * 0.02;
    }

    public double calculatePagibig(double grossPay) {
        return grossPay * 0.01;
    }

    public double calculateTax(double taxableIncome) {

        if (taxableIncome <= 20833)
            return 0;

        else if (taxableIncome <= 33333)
            return (taxableIncome - 20833) * 0.20;

        else if (taxableIncome <= 66667)
            return 2500 + (taxableIncome - 33333) * 0.25;

        else if (taxableIncome <= 166667)
            return 10833.33 + (taxableIncome - 66667) * 0.30;

        else
            return 40833.33 + (taxableIncome - 166667) * 0.32;
    }

    public double calculateNetPay(Employee employee) {

        double gross = employee.calculateGrossPay();

        double sss = calculateSSS(gross);
        double philhealth = calculatePhilHealth(gross);
        double pagibig = calculatePagibig(gross);

        double taxableIncome = gross - (sss + philhealth + pagibig);

        double tax = calculateTax(taxableIncome);

        return gross - (sss + philhealth + pagibig + tax);
    }

    public void displayPayrollSummary(Employee employee) {

        double gross = employee.calculateGrossPay();

        double sss = calculateSSS(gross);
        double philhealth = calculatePhilHealth(gross);
        double pagibig = calculatePagibig(gross);

        double taxableIncome = gross - (sss + philhealth + pagibig);

        double tax = calculateTax(taxableIncome);

        double net = gross - (sss + philhealth + pagibig + tax);

        System.out.println("Employee: " + employee.getEmployeeId());
        System.out.printf("Gross Pay: %.2f%n", gross);
        System.out.printf("SSS: %.2f%n", sss);
        System.out.printf("PhilHealth: %.2f%n", philhealth);
        System.out.printf("Pag-IBIG: %.2f%n", pagibig);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Net Pay: %.2f%n", net);
    }
}
