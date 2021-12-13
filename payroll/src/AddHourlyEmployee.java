public class AddHourlyEmployee {
    private int itsEmpid;
    private String itsName;
    private String itsAddress;
    private double itsHourlyRate;

    public AddHourlyEmployee(int empid, String name, String address, double hourlyRate){
        itsEmpid = empid;
        itsName = name;
        itsAddress = address;
        itsHourlyRate = hourlyRate;
    }

    public PaymentClassification getClassification(){
        return new HourlyClassification(itsHourlyRate);
    }

    public PaymentSchedule getSchedule(){
        return new WeeklySchedule();
    }

    public void execute(){
        System.out.println("Add Employee: " + itsEmpid + ", " + itsName);

        PaymentClassification ps = getClassification();
        PaymentSchedule pc = getSchedule();

        Employee e = new Employee(itsEmpid, itsName, itsAddress);

        e.setClassification(ps);
        e.setSchedule(pc);
//        e.setMethod(pm);

        PayrollDatabase.addEmployee(e);
    }
}
