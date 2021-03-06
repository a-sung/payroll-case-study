import java.util.HashMap;
import java.util.Map;

public class PayrollDatabase {
    private static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();

    public static Employee getEmployee(int employeeId) {
        return employees.get(employeeId);
    }

    public static void addEmployee(Employee e) {
        employees.put(e.getEmpid(), e);
    }

}