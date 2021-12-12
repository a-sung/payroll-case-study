public abstract class AddEmployeeTransaction implements Transaction{

    private int itsEmpid;
    private String itsName;
    private String itsAddress;

    public AddEmployeeTransaction(int empid, String name, String address){
        itsEmpid = empid;
        itsName = name;
        itsAddress = address;
    }

    public abstract PaymentClassification getClassification();
    public abstract PaymentSchedule getSchedule();

    @Override
    public void execute() {
        System.out.println("Add Employee: " + itsEmpid + ", " + itsName);
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = new HoldMethod();

        Employee e = new Employee(itsEmpid, itsName, itsAddress);

        e.setClassification(pc);
        e.setSchedule(ps);
        e.setMethod(pm);

        PayrollDatabase.addEmployee(e);

    }

}
