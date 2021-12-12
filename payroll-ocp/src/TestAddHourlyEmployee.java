public class TestAddHourlyEmployee {
    public static void main (String[]args){

        int empid = 1;
        AddHourlyEmployee t = new AddHourlyEmployee(empid, "Bob", "Home", 10.00);
        t.execute();

        Employee e = PayrollDatabase.getEmployee(empid);
        System.out.println("Name: " + e.getName());
        System.out.println(e.getClassification().getCode() + ": " + e.getClassification().calculatePay());
        System.out.println("Schedule: " + e.getSchedule().getSchedule());
    }
}