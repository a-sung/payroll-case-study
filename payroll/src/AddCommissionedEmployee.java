public class AddCommissionedEmployee implements Transaction{

    private int itsEmpid;
    private String itsName;
    private String itsAddress;
    private double itsSalary;
    private double itsCommissionRate;

    public AddCommissionedEmployee(int empid, String name, String address, double salary, double commissionRate){
        itsEmpid = empid;
        itsName = name;
        itsAddress = address;
        itsSalary = salary;
        itsCommissionRate = commissionRate;
    }

    public PaymentClassification getClassification(){
        return new CommissionedClassification(itsSalary, itsCommissionRate);
    }

    public PaymentSchedule getSchedule(){
        return new BiweeklySchedule();
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
