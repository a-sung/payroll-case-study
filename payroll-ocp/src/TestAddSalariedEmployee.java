public class TestAddSalariedEmployee {
        public static void main (String[]args){

                int empid = 1;
                AddSalariedEmployee t = new AddSalariedEmployee(empid, "Bob", "Home", 1000.00);
                t.execute();
                // t라는 Transaction이 event 제어
                // AddSalariedEmployee와 .execute() 분리 -> 객체 생성과 실제 실행을 분리함
                // Transaction = Command Pattern

                Employee e = PayrollDatabase.getEmployee(empid);
                System.out.println("Name: " + e.getName());
                System.out.println(e.getClassification().getCode() + ": " + e.getClassification().calculatePay());
                System.out.println("Schedule: " + e.getSchedule().getSchedule());

//                assertTrue("Bob".equals(e.getName()));
//                assertTre("Home".equals(e.getAddress()));
//                assertTrue(e.getClassification() instanceof SalariedClassification);

    }
}
