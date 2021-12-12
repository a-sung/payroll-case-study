public class TestAddCommissionedEmployee {
    public static void main (String[]args){

        int empid = 1;
        AddCommissionedEmployee t = new AddCommissionedEmployee(empid, "Bob", "Home", 100.00, 5.00);
        t.execute();

        Employee e = PayrollDatabase.getEmployee(empid);
        System.out.println("Name: " + e.getName());
        System.out.println(e.getClassification().getCode() + ": " + e.getClassification().calculatePay());
        System.out.println("Schedule: " + e.getSchedule().getSchedule());
    }
}
