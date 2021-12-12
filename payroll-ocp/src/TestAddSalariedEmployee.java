public class TestAddSalariedEmployee {
        public static void main (String[]args){

                int empid = 1;
                AddSalariedEmployee t = new AddSalariedEmployee(empid, "Bob", "Home", 1000.00);
                t.execute();

                Employee e = PayrollDatabase.getEmployee(empid);
                System.out.println("Name: " + e.getName());
                System.out.println(e.getClassification().getCode() + ": " + e.getClassification().calculatePay());
                System.out.println("Schedule: " + e.getSchedule().getSchedule());

//                assertTrue("Bob".equals(e.getName()));
//                assertTre("Home".equals(e.getAddress()));
//                assertTrue(e.getClassification() instanceof SalariedClassification);

    }
}
