public class AddSalariedEmployee implements Transaction{

    private int itsEmpid;
    private String itsName;
    private String itsAddress;
    private double itsSalary;

    public AddSalariedEmployee(int empid, String name, String address, double salary){
        itsEmpid = empid;
        itsName = name;
        itsAddress = address;
        itsSalary = salary;
    }

    public PaymentClassification getClassification(){
        return new SalariedClassification(itsSalary);
    }

    public PaymentSchedule getSchedule(){
        return new MonthlySchedule();
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
