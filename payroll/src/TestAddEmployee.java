public class TestAddEmployee {
    public static void main (String[]args){
        PayrollDatabase db = new PayrollDatabase();

        // Add Salaried Employee
        int empid = 1;
        AddSalariedEmployee t1 = new AddSalariedEmployee(empid, "Bob", "Home", 1000.00);
        t1.execute();

        // Add Hourly Employe
        empid = 2;
        AddHourlyEmployee t2 = new AddHourlyEmployee(empid, "Lisa", "Home", 10.00);
        t2.execute();

        // Add Commissioned Employe
        empid = 3;
        AddCommissionedEmployee t3 = new AddCommissionedEmployee(empid, "Jake", "Home", 100.00, 5.00);
        t3.execute();

        // in db
        for (int i = 1; i<empid+1; i++){
            System.out.println("-------------------------------------");
            Employee e = PayrollDatabase.getEmployee(i);
            System.out.println("Name: " + e.getName());
            System.out.println(e.getClassification().getCode() + ": " + e.getClassification().calculatePay());
            System.out.println("Schedule: " + e.getSchedule().getSchedule());
        }
    }
}